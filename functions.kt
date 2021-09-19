// creating a function

fun main() {
  println("Hello World")
}

fun myFunction() {
  // println is a predefined function
  println("I just got executed!")
}

// calling a function

fun start() {
  myFunction() // call myFunction
} // outputs "I just got executed!"

// function parameters

fun exampleFunction(fname: String) {
  println(fname + "Doe")
}

fun main() {
  exampleFunction("John")
  exampleFunction("Jane")
  exampleFunction("George")
}

// multiple parameters

fun exampleTwo(fname: String, age: Int) {
  println(fname + " is " + age)
}

fun main() {
  exampleTwo("John", 35)
  exampleTwo("Jane", 32)
  exampleTwo("George", 15)
}

// return values

fun myFunction(x: Int): Int {
  return (x + 5)
}

fun main() {
  var result = myFunction(3)
  println(result)
} // 8 (3 + 5)

fun myFunctionTwo(x: Int, y: Int): Int {
  return (x + y)
}

fun mainTwo() {
  var result = myFunction(3, 5)
  println(result)
} // 8 (3 + 5)

// shorter syntax for return values
// There is also a shorter syntax for returning values.
// You can use the = operator instead of return without specifying the return type.
// Kotlin is smart enough to automatically find out what it is

fun myFunction(x: Int, y: Int) = x + y

fun main() {
  var result = myFunction(3, 5)
  println(result)
} // 8 (3 + 5)
