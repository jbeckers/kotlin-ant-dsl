plugins {
    kotlin("jvm") version "1.6.10"
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
}

application {
    mainClass.set("com.devcharly.kotlin.ant.generator.MainKt")
}
