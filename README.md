# micronaut-demo

**A sample project to explore and practice various features of [Micronaut](https://micronaut.io/).**

## Table of Contents
- [About](#about)
- [Features](#features)
- [Requirements](#requirements)
- [Getting Started](#getting-started)
- [Running the Application](#running-the-application)
- [Testing](#testing)
- [Project Structure](#project-structure)
- [Useful Commands](#useful-commands)
- [Further Reading](#further-reading)

---

## About

This project serves as a playground for practicing and testing Micronaut features such as dependency injection, configuration, HTTP server/client, and more.

## Features

- Fast startup and low memory footprint
- Dependency injection
- REST API endpoints
- Configuration management
- Simple health check endpoint

## Requirements

- Java 17 or newer
- Gradle (or use the `./gradlew` wrapper)

## Getting Started

1. **Clone the repository:**

    ```bash
    git clone https://github.com/lissam1/micronaut-demo.git
    cd micronaut-demo
    ```

2. **Build the project:**

    ```bash
    ./gradlew clean build
    ```

3. **Run the application:**

    ```bash
    ./gradlew run
    ```

    The default server will start at [http://localhost:8080](http://localhost:8080).

## Running the Application

To run quickly, use:
```bash
./gradlew run
```

## Testing

Run the tests with:
```bash
./gradlew test
```

## Project Structure

```
micronaut-demo/
├── src/
│   ├── main/
│   │   ├── java/
│   │   └── resources/
│   └── test/
│       ├── java/
│       └── resources/
├── build.gradle
└──
```

## Useful Commands

- Run application: `./gradlew run`
- Run tests: `./gradlew test`
- Build fat JAR: `./gradlew shadowJar`

## Further Reading

- [Micronaut Documentation](https://docs.micronaut.io/)
- [Micronaut Guides](https://guides.micronaut.io/)
- [Micronaut API Reference](https://docs.micronaut.io/latest/api/)
