# Spring CLI example

Baseline CLI Java application, for enterprise

- Spring framework
- CLI - PicoCLI library with built-in help page
- Unit tests separation - regular and "Large" tests ("IT")
- Tests coverage - Pitest framework (mutational)

## Prerequisites

- Java: openjdk version "11" (or similar)
- Maven: Apache Maven 3.8.3 (or similar)

## Build

```
mvn clean install
```

## CLI Help page 

```
java -jar target/spring-cli-1.0-SNAPSHOT.jar --help
```

```
Usage: command-example [-hV] -i=<input> -o=<output>
  -h, --help              Show this help message and exit.
  -i, --input=<input>     Input directory
  -o, --output=<output>   Output directory
  -V, --version           Print version information and exit.
```

## Execution example

```
java -jar target/spring-cli-1.0-SNAPSHOT.jar --input=i --output=o
```

## Large tests example

__Note:__ Tests with "Large" (case-sensitive) in their name are not executed during Maven's regular test phase.
To run "Large" tests - specific profile (`large-tests`) should be active.

See: [ExampleLargeTest](src/test/java/com/ilyamur/springcli/ExampleLargeTest.java)

### Running large tests

```
mvn clean test -P large-tests
```

## Mutational coverage

```
mvn clean test org.pitest:pitest-maven:mutationCoverage
```

See created file in browser: `target/pit-reports/index.html`
