# InMarket - Practice

###Requirements:
* Java Development Kid (8 or newer)
    [downloads jdk 8](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
* IntelliJ IDEA: Community Edition.
    [Download IntelliJ IDEA](https://www.jetbrains.com/idea/download) 

Once IntelliJ IDEA is installed

1. Copy this project in your local disk
2. Open IntelliJ IDE
3. Select File > New > Project from Existing Sources...
4. Select the project folder
5. Select Gradle in the "Import Project" window and click "Next"
6. Select "Finish"

### Structure
Test scenarios path: `src/test/resources/features`

Test definition (implementation) path: `src/test/java/practice`

Execution Report: `target/site/serenity/index.html`

###Execute the tests
```json
$ gradlew clean test
```