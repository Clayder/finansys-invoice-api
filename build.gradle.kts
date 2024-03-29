plugins {
    kotlin("jvm") version "1.9.22"
    id("com.github.jmongard.git-semver-plugin") version "0.12.4"
    id("org.jlleitschuh.gradle.ktlint") version "12.1.0"
}

group = "br.clayder.finansys.invoice"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}