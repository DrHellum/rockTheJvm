package lectures.part1basics

object Expressions extends App {
  val x = 1 + 2 // EXPRESSION

  println(x)

  println(2 + 3 * 4)

  println(1 == x)

  // Instructions (DO) vs expressions

  val aCondition = true

  val aConditionedVal = if (aCondition) 5 else 3 // IF EXPRESSION

  println(aConditionedVal)

  var aVariable = 3

  val aWeirdValue = (aVariable = 3)

  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "Hello" else "Goodbye"
  }

  println(aCodeBlock)



}
