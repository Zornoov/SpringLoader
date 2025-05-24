package dev.zornov.loader.test

import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component

@Component
class ExampleService {

    private val logger = LoggerFactory.getLogger(ExampleService::class.java)

    fun doSomething() {
        logger.info("ExampleService is doing something important!")
    }
}