plugins {
    kotlin("jvm") version "1.6.10"
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
    implementation(project(":dsl"))
}

application {
    mainClass.set("DemoKt")
}

sourceSets.main {
    java.srcDirs("src")
}
