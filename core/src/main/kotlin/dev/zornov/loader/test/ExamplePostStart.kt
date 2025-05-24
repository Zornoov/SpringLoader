package dev.zornov.loader.test

import dev.zornov.loader.core.lifecycle.PostStart
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component

@Component
class ExamplePostStart : PostStart {

    private val logger = LoggerFactory.getLogger(ExamplePostStart::class.java)

    override fun execute() {
        logger.info("[PostStart] ExamplePostStart executed!")
    }
}
