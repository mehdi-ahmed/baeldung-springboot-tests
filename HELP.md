# Articles from Baeldung.com

* [A Guide to JUnit 5](https://www.baeldung.com/junit-5) // TODO
* [Execute Tests Based on Active Profile With JUnit 5](https://www.baeldung.com/spring-boot-junit-5-testing-active-profile)


-----------

To run JUnit 5 tests through Maven, below are the main required dependencies:

-   junit-jupiter-api: It is the main module where all core annotations are located, such as @Test, Lifecycle method annotations and assertions.
-   junit-jupiter-engine: It has test engine implementation which is required at runtime to execute the tests.
-   junit-platform-suite: The @Suite support provided by this module to make the JUnitPlatform runner obsolete.
-   junit-jupiter-params: Support for parameterized tests in JUnit 5.