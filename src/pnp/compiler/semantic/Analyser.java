package pnp.compiler.semantic;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import pnp.compiler.exception.CompilationException;
import pnp.compiler.exception.SemanticException;
import pnp.compiler.model.construct.Construct;
import pnp.compiler.model.expression.Expression;
import pnp.compiler.model.construct.Variable;
import pnp.compiler.model.construct.type.primitives.PrimitiveType;
import pnp.compiler.syntax.grammar.antlr.PnpLexer;
import pnp.compiler.syntax.grammar.antlr.PnpParser;

import java.io.IOException;
import java.util.List;
import java.util.Stack;

public class Analyser {
    Stack<Expression> executionStack = new Stack<Expression>();
    private SymbolTable mainTable = new SymbolTable();
    SymbolTable currentTable = mainTable;

    public void analyse(String sourceFile) throws CompilationException {
        initialValueToTest();
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

    private void initialValueToTest() {
        String key = "j";
        Variable test = new Variable(PrimitiveType.Inteiro, key, 60);
        currentTable.tryPutValue(key, test);
    }
}
