package lectures.part1basics

object ValuesVariablesTypes extends App {
  // VALS ARE IMMUTABLE
  // COMPILER can infer types
  val x = 42

  println(x)

  val aString: String = "Hello";
  val anotherString = "goodbye"

  val aBoolean: Boolean = false
  val aChar = 'a'
  val anInt: Int = x
  val aShort: Short = 4613
  val aLong: Long = 511841984981L
  val aFloat: Float = 2.0f

  var aVariable: Int = 4

  aVariable = 5 // side effects
}
