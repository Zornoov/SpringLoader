package dev.zornov.loader.core.lifecycle

import org.slf4j.LoggerFactory
import org.springframework.boot.context.event.ApplicationReadyEvent
import org.springframework.context.event.EventListener
import org.springframework.stereotype.Component
import kotlin.system.measureTimeMillis

@Component
class PostStartExecutor(
    val postStarts: List<PostStart>
) {
    val logger = LoggerFactory.getLogger(PostStartExecutor::class.java)

    @EventListener
    fun onReady(event: ApplicationReadyEvent) {
        val time = measureTimeMillis {
            postStarts.forEach { it.execute() }
        }
        logger.info("PostStart executed in ${"%.2f".format(time / 1000.0)}s")
    }
}