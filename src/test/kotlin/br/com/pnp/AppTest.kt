package br.com.pnp

import java.lang.Exception
import java.lang.reflect.Method
import junit.framework.TestCase

abstract class AppTest : TestCase() {
    protected abstract val subject: Any

    protected fun getPrivateMethod(name: String, vararg parameterTypes: Class<*>): Method? {
        try {
            val privateMethod = if (parameterTypes.isEmpty()) {
                subject.javaClass.getDeclaredMethod(name)
            } else {
                subject.javaClass.getDeclaredMethod(name, *parameterTypes)
            }
            privateMethod?.isAccessible = true

            return privateMethod
        } catch (e: Exception) {
            return null
        }
    }
}
