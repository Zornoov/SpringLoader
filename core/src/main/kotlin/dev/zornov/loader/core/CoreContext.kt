package dev.zornov.loader.core

import org.springframework.context.ConfigurableApplicationContext

class CoreContext(
    val springContext: ConfigurableApplicationContext
) {

    fun <T> get(clazz: Class<T>): T = springContext.getBean(clazz)

    inline fun <reified T> get(): T = springContext.getBean(T::class.java)

    fun shutdown() {
        springContext.close()
    }

    fun raw(): ConfigurableApplicationContext = springContext
}
