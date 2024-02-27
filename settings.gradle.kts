plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
}
rootProject.name = "invoice"
include("infrastructure")
include("domain")
include("application")
