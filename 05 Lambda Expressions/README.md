# Lambda Expressions

## General

Lambda expressions are used to implement functional interfaces. For example, the following expression implements a `Comparator<String>`, which compares the length of the given strings.

```java
(str1, str2) -> Integer.compare(str1.length, str2.length)
```

## Functional Interfaces

A functional interface has a single abstract method. 

**Best practices:**

- Prefer to use the standard functional interfaces!
  - You find them in the [java.util.function](https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/function/package-summary.html) package.
  - The functional interfaces in this package follow a naming convention:
    - `Consumer`: Has one or more arguments but returns nothing (`void`).
    - `Supplier`: Has no argument but returns a value.
    - `Function`: Has one or more arguments and returns a value.
    - `Predicate`: Has one ore more arguments and returns a boolean.
- Annotate your own functional interfaces with `@FunctionalInterface`!
  - So the compiler makes sure, that there is really just one abstract method in the interface.

## Method References

Method references are syntactic sugar for lambda expressions, for example:

- `String::toUpperCase()` is a shortcut for `(str) -> str.toUpperCase()`
- `String::compare` is a shortcut for `(str1, str2) -> String.compare(str1, str2)`

## Further reading

- https://www.baeldung.com/java-8-functional-interfaces
- https://www.baeldung.com/java-8-lambda-expressions-tips
- https://www.baeldung.com/java-method-references

