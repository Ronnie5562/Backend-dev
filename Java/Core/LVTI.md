// LVTI ==> Local Variable Type Inference

# Understanding the `var` Keyword in Java

The `var` keyword was introduced in Java 10 as part of the "Local-Variable Type Inference" feature, commonly known as "var type inference." This feature allows you to declare local variables without explicitly specifying the data type. The compiler infers the type based on the expression on the right-hand side of the assignment.

## How to Use `var`

To use the `var` keyword, you simply replace

```java
var variableName = initialValue;
```
where variableName is the name of the variable, and initialValue is the value or expression used to initialize the variable.

## Key Points and Considerations
The var keyword can only be used for local variables within method bodies or initializer blocks. It cannot be used for fields at the class level, method parameters, or return types.

The type inferred by var is determined by the expression on the right-hand side of the assignment. The type is resolved at compile time, and the variable becomes strongly typed.

The var keyword does not mean "variant" or "dynamic typing." It is still statically typed, and the type is known at compile time. It simply reduces redundancy in code by inferring the type from the initialization expression.

While var reduces boilerplate code, it's essential to use it judiciously and maintain code readability. It's good practice to use var when the type is evident from the initialization expression, but avoid it when the type isn't immediately clear to someone reading the code.

Some scenarios where using var is beneficial include when dealing with long generic types, complex lambda expressions, or situations where the type is evident from the right-hand side.

Using var can make code more flexible to changes, as you only need to update the right-hand side of the assignment, and the variable type will be adjusted accordingly.

Overall, the var keyword is a valuable addition to Java that promotes cleaner, more concise code while maintaining the benefits of static typing.