pluginManagement {
    plugins {
        id("com.google.devtools.ksp") version "1.5.21-1.0.0-beta07" apply false
    }
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/bootstrap/")
    }
}

rootProject.name = "My_Application"
include(":androidApp")
include(":shared")
include(":test-processor")