package br.com.pnp.model.construct.statement

import br.com.pnp.AppTest
import br.com.pnp.model.construct.Variable
import org.junit.Test
import kotlin.test.assertFailsWith

class IfStatementTest: AppTest() {
    override val subject = IfStatement(Variable.literalBoolean(true))

    @Test
    fun testConstructorFail() {
        // for some reason, @Test(expected = IllegalArgumentException::class) didn't work
        assertFailsWith(IllegalArgumentException::class) {
            IfStatement(Variable.literalCharacter('a'))
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

    @Test
    fun testLastElseStatement() {
        val privateMethod = getPrivateMethod("lastElseStatement")

        privateMethod?.let {
            val lastElseStatement = it.invoke(subject)
            assert(lastElseStatement is IfStatement)

            val result = lastElseStatement as IfStatement
            assertEquals(false, result.hasElseBranch)
            assertEquals(subject, result)
        }
        assertNotNull(privateMethod)
    }

    @Test
    fun testStartElseStatementWithCondition() {
        val condition = Variable.literalBoolean(true)
        val lastElseStatementMethod = getPrivateMethod("lastElseStatement")

        lastElseStatementMethod?.let {
            val lastElseStatement = it.invoke(subject) as IfStatement
            assertNull(lastElseStatement.elseBlock)

            val result = subject.startElseStatement(condition)

            assertEquals(true, lastElseStatement.hasElseBranch)
            assertEquals(lastElseStatement.elseBlock, result)
            assertEquals(condition, lastElseStatement.elseBranch?.condition)
        }
        assertNotNull(lastElseStatementMethod)
    }

    @Test
    fun testStartElseStatementWithoutCondition() {
        val lastElseStatementMethod = getPrivateMethod("lastElseStatement")

        lastElseStatementMethod?.let {
            val lastElseStatement = it.invoke(subject) as IfStatement
            val result = subject.startElseStatement()

            assertEquals(true, lastElseStatement.hasElseBranch)
            assertEquals(lastElseStatement.elseBlock, result)
        }
        assertNotNull(lastElseStatementMethod)
    }
}
