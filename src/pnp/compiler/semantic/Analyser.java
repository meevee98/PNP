package pnp.compiler.semantic;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import pnp.compiler.model.Construct;
import pnp.compiler.model.Expression;
import pnp.compiler.syntax.grammar.antlr.PnpLexer;
import pnp.compiler.syntax.grammar.antlr.PnpParser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Analyser {
    Stack<Expression> executionStack = new Stack<Expression>();
    SymbolTable symbolTable = new SymbolTable();

    public void analyse(String sourceFile) {
        try {
            PnpLexer lexical = new PnpLexer(CharStreams.fromFileName(sourceFile));
            CommonTokenStream tokens = new CommonTokenStream(lexical);
            PnpParser syntax = new PnpParser(tokens);
            PnpParser.FileContext tree = syntax.file();

            PnpContext rules = new PnpContext(this);
            ParseTreeWalker verifier = new ParseTreeWalker();
            verifier.walk(rules, tree);


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
        return symbolTable.tryGetValue(key);
    }

    public List<Expression> getList() {
        List<Expression> list = new ArrayList<>();
        List<Expression> test = (List<Expression>) executionStack.clone();
        return test;
    }
}
