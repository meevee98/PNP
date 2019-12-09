package br.com.pnp.compiler.model.construct.statement;

import br.com.pnp.compiler.model.construct.Block;
import br.com.pnp.compiler.model.construct.type.Type;
import br.com.pnp.compiler.model.construct.type.primitives.PrimitiveType;
import br.com.pnp.compiler.model.expression.Expression;

public class IfStatement extends Statement {
    private Block block;
    private IfStatement elseStatement = null;
    private Expression condition;

    public IfStatement(Expression condition) {
        this.block = new StatementBlock();
        this.condition = condition;
    }

    private IfStatement(IfStatement ifBranch) {
        this.block = new StatementBlock();
    }

    public Block startElseBranch(Expression condition) {
        elseStatement = new IfStatement(condition);
        return elseStatement.block;
    }

    public Block startElseBranch() {
        elseStatement = new IfStatement(this);
        return elseStatement.block;
    }

    public boolean hasElseBranch() {
        return elseStatement != null;
    }

    @Override
    public Type getType() {
        return PrimitiveType.Booleano;
    }

    public Block getIfBlock() {
        return block;
    }

    public Block getElseBlock() {
        if (elseStatement != null) {
            return elseStatement.block;
        }
        return null;
    }

    public IfStatement getElseStatement() {
        return elseStatement;
    }

    public Expression getCondition() {
        return condition;
    }
}
