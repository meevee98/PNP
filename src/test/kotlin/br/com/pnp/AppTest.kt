package br.com.pnp

import junit.framework.TestCase
import java.lang.Exception
import java.lang.reflect.Method

abstract class AppTest: TestCase() {
    protected abstract val subject: Any

    protected fun getPrivateMethod(name: String, parameterTypes: Class<*>? = null): Method? {
        try {
            val privateMethod = if (parameterTypes == null) {
                subject.javaClass.getDeclaredMethod(name)
            } else {
                subject.javaClass.getDeclaredMethod(name, parameterTypes)
            }
            privateMethod?.isAccessible = true

            return privateMethod
        }
        catch (e: Exception) {
            return null
        }
    }
}
