group = "com.devcharly"
version = 0.6

plugins {
    kotlin("jvm") version "1.6.10"

    `java-library`
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("org.apache.ant:ant:1.10.12")
}
