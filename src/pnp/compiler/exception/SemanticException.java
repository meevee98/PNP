package pnp.compiler.exception;

import org.antlr.v4.runtime.Token;

public class SemanticException extends RuntimeException {
    public SemanticException(Token startToken, String message) {
        super("line " + startToken.getLine() + ":" + startToken.getCharPositionInLine() + " " + message);
    }
}
