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
