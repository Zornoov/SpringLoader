package dev.zornov.loader.core.lifecycle

import org.slf4j.LoggerFactory
import org.springframework.beans.factory.SmartInitializingSingleton
import org.springframework.context.ApplicationContext
import org.springframework.stereotype.Component
import kotlin.system.measureTimeMillis

@Component
class PreStartExecutor(
    val context: ApplicationContext
) : SmartInitializingSingleton {

    val logger = LoggerFactory.getLogger(PreStartExecutor::class.java)

    override fun afterSingletonsInstantiated() {
        val beans = context.getBeansOfType(PreStart::class.java).values
        val time = measureTimeMillis {
            beans.forEach { it.execute() }
        }
        logger.info("PreStart executed in ${"%.2f".format(time / 1000.0)}s")
    }
}
