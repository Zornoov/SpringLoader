plugins {
    id("org.springframework.boot") version "3.2.5"
    id("io.spring.dependency-management") version "1.1.4"
}


dependencies {
    // Spring Boot Core
    implementation("org.springframework.boot:spring-boot-starter")

    // Logging
    implementation("org.apache.logging.log4j:log4j-api:2.20.0")
    implementation("org.apache.logging.log4j:log4j-core:2.20.0")
}
