plugins {
    kotlin("jvm") version "1.9.20"
    application
    id("com.github.johnrengelman.shadow") version "8.1.1"
}

group = "org.example"
version = "1.0-SNAPSHOT"

application {
    mainClass.set("org.example.MainKt")
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

kotlin {
    jvmToolchain(17)
}

tasks.test {
    useJUnitPlatform()
}

// 🔑 КЛЮЧЕВАЯ ЧАСТЬ — настройка shadowJar
tasks.named<com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar>("shadowJar") {
    archiveClassifier.set("all")
    // Явно указываем Main-Class через манифест
    manifest {
        attributes["Main-Class"] = application.mainClass.get()
    }
}