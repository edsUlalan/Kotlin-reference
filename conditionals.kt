// if statement

if (20 > 18) {
  // block of code to be executed if the condition is true
  println("20 is greater than 18")
}

val x = 20
val y = 18
if (x > y) {
  println("x is greater than y")
}

// else statement

val time = 20
if (time < 18) {
  println("Good day.")
} else {
  println("Good evening.")
} // outputs "Good evening."

// else if statement

val time = 22
if (time < 10) {
  println("Good morning.")
} else if (time < 20) {
  println("Good day.")
} else {
  println("Good evening.")
} // outputs "Good evening."

// if..else expression

val time = 20
val greeting = if (time < 18) {
  "Good day."
} else {
  "Good evening."
}
println(greeting)

// you can ommit the curly braces {} when if has only one statement

fun main() {
  val time = 20
  val greeting = if (time < 18) "Good day." else "Good evening."
  println(greeting)
}
