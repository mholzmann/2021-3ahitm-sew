# Streams

The package [`java.util.stream`](https://docs.oracle.com/javase/8/docs/api/java/util/stream/package-summary.html) contains classes to support functional-style operations on streams. A stream is a sequence of objects that supports various methods which can be pipelined to produce the desired result.

Important characteristics of streams are:

- A stream is not a data structure instead it takes input from collections, arrays or I/O channels.
- Streams don’t change the original data structure, they only provide the result of the pipelined methods.

## Stream Operations

There are many useful operations that can be performed on a stream. They are divided into **intermediate operations** and **terminal operations**:

- Each intermediate operation is lazily executed and returns a stream as a result, hence various intermediate operations can be chained (pipelined). 
  - e.g. `distinct`, `filter()`, `limit()`,  `map()`, `peek()`, `skip()`, `sorted()`
- Terminal operations mark the end of the stream and return the final result.
  - e.g. `collect()`, `count()`, `forEach()`, `reduce()`

## Further Reading

- https://www.geeksforgeeks.org/stream-in-java/
- https://www.baeldung.com/java-8-streams-introduction
- https://www.baeldung.com/java-8-streams