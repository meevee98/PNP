package br.com.pnp

import junit.framework.TestCase
import java.lang.Exception
import java.lang.reflect.Method

abstract class AppTest: TestCase() {
    protected abstract val subject: Any

    fun getPrivateMethod(name: String, parameterTypes: Class<*>): Method? {
        try {
            val privateMethod = subject.javaClass.getDeclaredMethod(name, parameterTypes)
            privateMethod.isAccessible = true

            return privateMethod
        }
        catch (e: Exception) {
            return null
        }
    }
}
