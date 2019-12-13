package br.com.pnp

import java.lang.reflect.Method
import junit.framework.TestCase

abstract class AppTest : TestCase() {
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
        } catch (e: Exception) {
            return null
        }
    }

    protected fun getPrivateAttribute(name: String): Any? {
        try {
            val privateAttribute = subject.javaClass.getDeclaredField(name)
            privateAttribute?.isAccessible = true

            return privateAttribute?.get(subject)
        } catch (e: Exception) {
            return null
        }
    }
}
