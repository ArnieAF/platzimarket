plugins {
	java
	id("org.springframework.boot") version "3.3.4"
	id("io.spring.dependency-management") version "1.1.6"
}

group = "com.platzi"
version = "0.0.1-SNAPSHOT"

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(17)
	}
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation("org.springframework.boot:spring-boot-starter-web")

	implementation("org.springdoc:springdoc-openapi-starter-webmvc-ui:2.1.0")

	implementation("com.microsoft.sqlserver:mssql-jdbc:10.2.0.jre8")
	implementation("org.mapstruct:mapstruct:1.6.2")
	annotationProcessor("org.mapstruct:mapstruct-processor:1.6.2")

	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.withType<Test> {
	useJUnitPlatform()
}
