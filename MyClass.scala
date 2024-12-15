```scala
class MyClass(val x: Int) {
  def myMethod(y: Int): Int = {
    x + y // Bug: Incorrect return type
  }
}
```