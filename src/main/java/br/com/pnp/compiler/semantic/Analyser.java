package br.com.pnp.compiler.semantic;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import br.com.pnp.compiler.exception.CompilationException;
import br.com.pnp.compiler.exception.SemanticException;
import br.com.pnp.compiler.model.construct.Block;
import br.com.pnp.compiler.model.construct.Construct;
import br.com.pnp.compiler.model.construct.statement.StatementBlock;
import br.com.pnp.compiler.model.expression.Expression;
import br.com.pnp.compiler.model.construct.Variable;
import br.com.pnp.compiler.model.instruction.Instruction;
import br.com.pnp.compiler.syntax.grammar.antlr.PnpLexer;
import br.com.pnp.compiler.syntax.grammar.antlr.PnpParser;

import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Stack;

public class Analyser {
    private Stack<Expression> executionStack = new Stack<Expression>();
    private SymbolTable mainTable = new SymbolTable();
    private SymbolTable currentTable = mainTable;
    private Stack<Block> blocks = new Stack<>();
    private Block currentBlock = null;

    public void analyse(String sourceFile) throws CompilationException {
        try {
            PnpLexer lexical = new PnpLexer(CharStreams.fromFileName(sourceFile));
            CommonTokenStream tokens = new CommonTokenStream(lexical);
            PnpParser syntax = new PnpParser(tokens);
            PnpParser.FileContext tree = syntax.file();

            PnpContext rules = new PnpContext(this);
            ParseTreeWalker verifier = new ParseTreeWalker();
            verifier.walk(rules, tree);
        }
        catch (RecognitionException | SemanticException ex) {
            throw new CompilationException(ex.getMessage());
        } catch (IOException ex) {
            System.out.println("FATAL: não achei o fonte " + sourceFile);
            System.exit(1);
        }
    }

    public SymbolTable getMainSymbolTable() {
        return mainTable;
    }

    public boolean tryPush(Expression item) {
        try {
            executionStack.push(item);
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }

    public Expression tryPop() {
        if (!executionStack.empty()) {
            return executionStack.pop();
        }
        return null;
    }

    public Collection<Construct> tryGetValues() {
        return currentTable.getValues();
    }

    public Construct tryGetConstruct(String key) {
        return currentTable.tryGetValue(key);
    }

    public void tryPutConstruct(String key, Construct value) {
        currentTable.tryPutValue(key, value);
    }

    public boolean exists(String key) {
        return currentTable.exists(key);
    }

    public boolean existsInThisScope(String key) {
        return currentTable.existsInThisScope(key);
    }

    public List<Expression> getList() {
        List<Expression> test = (List<Expression>) executionStack.clone();
        return test;
    }

    public Block getCurrentBlock() {
        return currentBlock;
    }

    public void newAssignment(Variable variable, Expression expression) {
        if (currentBlock != null) {
            currentBlock.addAssignmentCommand(variable, expression);
        }
    }

    public void newInstruction(Instruction statement) {
        if (currentBlock != null) {
            currentBlock.addInstruction(statement);
        }
    }

    public Instruction lastInstruction() {
        if (currentBlock != null) {
            return currentBlock.getLastInstruction();
        }
        return null;
    }

    public void newScope(Block newBlock) {
        blocks.push(currentBlock);
        currentBlock = newBlock;
        currentTable = currentTable.startNewScope();
    }

    public void newScope() {
        blocks.push(currentBlock);
        currentBlock = new StatementBlock();
        currentTable = currentTable.startNewScope();
    }

    public void endScope() {
        if (currentBlock != null) {
            for(Variable var : currentTable.getVariables()) {
                currentBlock.addDeclarationCommand(var);
            }
        }
        currentTable = currentTable.lastScope();
        if (blocks.empty()) {
            currentBlock = null;
        }
        else {
            currentBlock = blocks.pop();
        }
    }
}
