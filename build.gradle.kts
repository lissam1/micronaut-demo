plugins {
    id("io.micronaut.application") version "4.6.1"
    id("com.gradleup.shadow") version "8.3.7"
    id("io.micronaut.aot") version "4.6.1"
  id("org.openrewrite.rewrite") version "7.21.0"
}

version = "0.1"
group = "com.example"

repositories {
    mavenCentral()
}

dependencies {
    annotationProcessor("io.micronaut.validation:micronaut-validation-processor")
    annotationProcessor("io.micronaut:micronaut-http-validation")
    annotationProcessor("io.micronaut.serde:micronaut-serde-processor")
    annotationProcessor("io.micronaut.jaxrs:micronaut-jaxrs-processor")
    annotationProcessor("io.micronaut.sourcegen:micronaut-sourcegen-generator-java")
    annotationProcessor("io.micronaut.openapi:micronaut-openapi")

    implementation("io.netty:netty-bom:4.2.7.Final")
    implementation("io.micronaut.validation:micronaut-validation")
    implementation("io.micronaut:micronaut-management")
    implementation("io.micronaut.jaxrs:micronaut-jaxrs-server")
    implementation("io.micronaut.sourcegen:micronaut-sourcegen-annotations")
    implementation("io.micronaut.serde:micronaut-serde-jackson")
    implementation("io.micronaut.problem:micronaut-problem-json")

    compileOnly("io.micronaut.openapi:micronaut-openapi-annotations")
    implementation("io.micronaut.openapi:micronaut-openapi")
    compileOnly("io.micronaut:micronaut-http-client")
    runtimeOnly("ch.qos.logback:logback-classic")

    testImplementation("org.skyscreamer:jsonassert:2.0-rc1")
    testImplementation("io.micronaut:micronaut-http-client")
    testImplementation("io.micronaut.test:micronaut-test-junit5")
    testImplementation("org.junit.jupiter:junit-jupiter-params")
    testAnnotationProcessor("io.micronaut.jaxrs:micronaut-jaxrs-processor")
}


application {
    mainClass = "com.example.Application"
}
java {
    sourceCompatibility = JavaVersion.toVersion("21")
    targetCompatibility = JavaVersion.toVersion("21")
}


graalvmNative.toolchainDetection = false

micronaut {
    runtime("netty")
    testRuntime("junit5")
    processing {
        incremental(true)
        annotations("com.example.*")
    }
    aot {
        // Please review carefully the optimizations enabled below
        // Check https://micronaut-projects.github.io/micronaut-aot/latest/guide/ for more details
        optimizeServiceLoading = false
        convertYamlToJava = false
        precomputeOperations = true
        cacheEnvironment = true
        optimizeClassLoading = true
        deduceEnvironment = true
        optimizeNetty = true
        replaceLogbackXml = true
    }
}


tasks.named<io.micronaut.gradle.docker.NativeImageDockerfile>("dockerfileNative") {
    jdkVersion = "21"
}



