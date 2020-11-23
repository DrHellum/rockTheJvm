package lectures.part1basics

object Functions extends App {
  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }

  println(aFunction("The meaning is", 42))

  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + " " + aRepeatedFunction(aString, n - 1)
  }

  println(aRepeatedFunction("hello", 3))


  def greeting(name: String, age: Int): String = {
    "Hi, my name is " + name + " and I am " + age + " years old"
  }

  println(greeting("Thomas", 50))

  def factorial(number: Int): Int = {
    if (number == 1) number else
      number * factorial(number - 1)
  }

  println(factorial(5))

  def fibonacci(number: Int): Int = {
    if (number <=2) 1 else
      fibonacci(number - 1) + fibonacci(number - 2)
  }

  println(fibonacci(20))

}
