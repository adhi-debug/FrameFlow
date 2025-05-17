// settings.gradle.kts

pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS)
    repositories {
        google()
        mavenCentral()
        maven { url = uri("https://maven.pkg.github.com/tanersener/mobile-ffmpeg") }    }
}

rootProject.name = "FrameFlow"

// Main application
include(":app")

// Optional: If you use OpenCV
include(":opencv")

// External video editor module

