plugins {
    kotlin("jvm") version "2.1.21" apply false
}

subprojects {
    apply(plugin = "org.jetbrains.kotlin.jvm")

    group = "dev.zornov.loader"

    repositories {
        mavenCentral()
    }
}
