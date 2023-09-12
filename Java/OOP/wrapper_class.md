# Wrapper Classes in Java

In Java, primitive data types (e.g., int, char, boolean) are not objects, and they do not belong to any class hierarchy. However, there are situations where you might need to treat these primitive types as objects, especially when working with collections or using certain Java libraries that expect objects.

This is where **wrapper classes** come into play. Wrapper classes in Java are a set of classes that provide an object representation for each of the primitive data types. They allow you to work with primitives as if they were objects.

## Common Wrapper Classes

Here are the common wrapper classes in Java:

- `Integer`: Wraps an `int`.
- `Long`: Wraps a `long`.
- `Float`: Wraps a `float`.
- `Double`: Wraps a `double`.
- `Boolean`: Wraps a `boolean`.
- `Character`: Wraps a `char`.
- `Byte`: Wraps a `byte`.
- `Short`: Wraps a `short`.

## Usage

Wrapper classes are often used in the following scenarios:

1. **Collections**: Java collections (e.g., `ArrayList`, `HashMap`) work with objects, not primitives. Wrapper classes allow you to store primitive values in collections.

2. **Null Values**: When you need to represent null values for primitive types, you can use wrapper classes. For example, `Integer` can be null, whereas `int` cannot.

3. **Generics**: When defining generic classes or methods, you can use wrapper classes to support both primitive and object types.

4. **Java Libraries**: Some Java libraries and APIs expect objects rather than primitives. Wrapper classes bridge this gap.

## Autoboxing and Unboxing

Java provides a feature called **autoboxing** and **unboxing** to automatically convert between primitives and their corresponding wrapper objects. For example:

```java
// Autoboxing (primitive to wrapper)
Integer num = 42;

// Unboxing (wrapper to primitive)
int value = num;
```

This feature simplifies the process of working with both primitives and wrapper objects.

In summary, wrapper classes in Java serve as a bridge between primitive data types and objects. They provide the necessary flexibility when you need to work with primitive values in contexts that require objects, such as collections and generics.