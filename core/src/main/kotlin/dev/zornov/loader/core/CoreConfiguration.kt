package dev.zornov.loader.core

import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

@Configuration
@ComponentScan(
    basePackages = [
        "dev.zornov.loader"
    ]
)
open class CoreConfiguration
