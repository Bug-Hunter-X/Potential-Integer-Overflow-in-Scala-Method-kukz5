# Potential Integer Overflow in Scala Method

This repository demonstrates a potential integer overflow bug in a simple Scala class. The `MyClass` class contains a `myMethod` that adds two integers. However, if the sum exceeds the maximum value for an `Int`, an integer overflow will occur, leading to unexpected behavior.

The `MyClassSolution.scala` file provides a corrected version that uses `BigInt` to avoid overflow issues, ensuring safe and correct operation for large numbers. 