# Unit Tests with AssertJ

## The Test Pyramid

As you can see in the following image, the typical pyramid consists of three layers. At the bottom, there is the automated unit-testing layer, in the middle the automated integration testing layer and at the top, there is the automated end-to-end testing layer (including the user interface tests). 

Each layer has a different size, indicating the number of tests that should be written within each stage. Manual testing is not part of the test pyramid, hence it is shown as a cloud for additional testing work.

![img](./images/test-pyramid.jpg)

**Unit tests** form the base of the testing pyramid. They test individual  components or functionalities to validate that it works as expected in  isolated conditions. It is important to run a number of scenarios in  unit tests – happy path, error handling, etc.

Unit tests verify small pieces of a codebase. However, in order to test  how this code interacts with other code (that form the entire software), **integration tests** need to be run. Essentially, these are tests that  validate the interaction of a piece of code with external components.  These components can range from databases, external services (APIs) and  the like.

At the top of the pyramid are the **end-to-end tests**. These ensure that  the entire application is functioning as required. End-to-end tests do  exactly what the name suggests: test that the application is working  flawlessly from start to finish.

## Unit Tests

With a unit test we check whether a *unit of work* behaves correctly under certain circumstances.

A *unit of work* is a use case in the system that starts with a public method and ends up with one of three types of results: 

- a return value/exception,
- a state change to the system which changes its behavior,
- or a call to a third party (when we use mocks). 

So a unit of work can be a small as a method, or as large as a class, or even multiple classes.

### Naming Convention

The basic naming of a test comprises of three main parts:

**[UnitOfWork_StateUnderTest_ExpectedBehavior]**

Examples:

- `public void sum_NegativeNumberAs1stParam_ThrowsException()`

- `public void sum_NegativeNumberAs2ndParam_ThrowsException ()`

- `public void sum_SimpleValues_ReturnsResult ()`

## AssertJ

[AssertJ](https://assertj.github.io/doc/) is an opensource library used for writing fluent and rich assertions in Java tests. You find a good introduction at [Baeldung](https://www.baeldung.com/introduction-to-assertj).

### Maven Dependencies

```xml
... 
<dependencies>
     <dependency>
         <groupId>org.junit.jupiter</groupId>
         <artifactId>junit-jupiter-api</artifactId>
         <version>5.6.2</version>
         <scope>test</scope>
     </dependency>
     <dependency>
         <groupId>org.assertj</groupId>
         <artifactId>assertj-core</artifactId>
         <version>3.17.2</version>
         <scope>test</scope>
     </dependency>
</dependencies>
...
```

## Sources

Shreya Bose: [Testing Pyramid : How to jumpstart Test Automation](https://www.browserstack.com/guide/testing-pyramid-for-test-automation)

Daniel Knott: [The Mobile Test Pyramid](https://www.ministryoftesting.com/dojo/lessons/the-mobile-test-pyramid)

Roy Osherove: [Naming standards for unit tests](https://osherove.com/blog/2005/4/3/naming-standards-for-unit-tests.html)
