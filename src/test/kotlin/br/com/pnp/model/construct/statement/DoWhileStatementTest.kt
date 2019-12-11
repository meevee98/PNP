package br.com.pnp.model.construct.statement

import br.com.pnp.AppTest
import br.com.pnp.model.construct.Variable
import kotlin.test.assertFailsWith
import org.junit.Test

class DoWhileStatementTest : AppTest() {
    override val subject = DoWhileStatement(Variable.literalBoolean(true))

    @Test
    fun testConstructorFail() {
        // for some reason, @Test(expected = IllegalArgumentException::class) didn't work
        assertFailsWith(IllegalArgumentException::class) {
            DoWhileStatement(Variable.literalCharacter('a'))
        }
    }

    @Test
    fun testSetConditionSuccess() {
        val condition = Variable.literalBoolean(true)
        subject.condition = condition
    }

    @Test
    fun testSetConditionFail() {
        // for some reason, @Test(expected = IllegalArgumentException::class) didn't work
        assertFailsWith(IllegalArgumentException::class) {
            val condition = Variable.literalRational(10.0)
            subject.condition = condition
        }
    }
}
