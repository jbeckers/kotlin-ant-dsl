plugins {
    kotlin("jvm") version "1.6.10"
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("org.ow2.asm:asm:9.2")
    implementation("org.apache.ant:ant:1.10.12")
}

application {
    mainClass.set("com.devcharly.kotlin.ant.generator.MainKt")
}
