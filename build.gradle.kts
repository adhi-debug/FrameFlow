plugins {
    id("com.android.application") version "8.8.2" apply false
    id("org.jetbrains.kotlin.android") version "1.7.10" apply false
    id("org.jetbrains.kotlin.plugin.compose") version "2.0.0" apply false
}

buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:8.8.2")
        classpath ("com.google.gms:google-services:4.3.15")
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.52")// Ensure it's inside buildscript
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
        maven {
            url = uri("https://storage.googleapis.com/tensorflow-nightly-public/prod/tf-snapshots-artifacts")
        }

        // FFmpegKit Maven
        maven {
            url = uri("https://www.arthenica.com/maven")}
        maven { url = uri("https://maven.pkg.github.com/tensorflow/tf-lite-support") }
        maven { url = uri("https://jitpack.io") }
        maven { url = uri("https://opencv.org/releases/") }
    }
}
