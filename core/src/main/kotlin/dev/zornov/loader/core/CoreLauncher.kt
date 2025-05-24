package dev.zornov.loader.core

import org.springframework.boot.Banner
import org.springframework.boot.builder.SpringApplicationBuilder

class CoreLauncher {
    fun run(vararg args: String): CoreContext {
        val context = SpringApplicationBuilder(CoreConfiguration::class.java)
            .bannerMode(Banner.Mode.CONSOLE)
            .logStartupInfo(false)
            .run(*args)

        return CoreContext(context)
    }
}