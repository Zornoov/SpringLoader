package dev.zornov.loader.test

import dev.zornov.loader.core.lifecycle.PreStart
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component

@Component
class ExamplePreStart : PreStart {

    val logger = LoggerFactory.getLogger(ExamplePreStart::class.java)

    override fun execute() {
        logger.info("[PreStart] ExamplePreStart executed!")
    }
}