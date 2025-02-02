import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.5.21"
    application
}

group = "nl.nielsvanhove"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.xenomachina:kotlin-argparser:2.0.7")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.2.2")
    implementation("org.jetbrains.lets-plot:lets-plot-kotlin-jvm:3.0.1")
    implementation("org.jetbrains.lets-plot:lets-plot-image-export:2.0.4")


    testImplementation(kotlin("test-junit5"))
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.7.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.7.2")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "11"
}

application {
    mainClass.set("nl.nielsvanhove.githistoricalstats.Main")
}