package pnp.compiler.model.construct.statement;

import pnp.compiler.model.construct.Block;
import pnp.compiler.model.construct.type.Type;
import pnp.compiler.model.construct.type.primitives.PrimitiveType;
import pnp.compiler.model.expression.Expression;

public class DoWhileStatement extends Statement {
    private Block block;
    private Expression condition;

    public DoWhileStatement() {
        this.block = new StatementBlock();
    }

    @Override
    public Type getType() {
        return PrimitiveType.Booleano;
    }

    public Block getDoWhileBlock() {
        return this.block;
    }

    public Expression getCondition() {
        return this.condition;
    }

    public void setCondition(Expression condition) {
        this.condition = condition;
    }
}
