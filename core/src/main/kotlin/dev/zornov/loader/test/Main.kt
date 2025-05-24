package dev.zornov.loader.test

import dev.zornov.loader.core.CoreContext
import dev.zornov.loader.core.CoreLauncher

fun main() {
    println("Starting SpringLoader Core...")

    val context: CoreContext = CoreLauncher().run()

    val example = context.get<ExampleService>()
    example.doSomething()
}
