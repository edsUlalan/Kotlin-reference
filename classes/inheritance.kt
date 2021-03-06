// subclass (child) - the class that inherits from another class
// superclass (parent) - the class being inherited from

// Superclass
open class MyParentClass {
  val x = 5
}

// Subclass
class MyChildClass: MyParentClass() {
  fun myFunction() {
    println(x) // x is now inherited from the superclass
  }
}

// create an object of MyChildClass and call myFunction
fun main() {
  val myObj = MyChildClass()
  myObj.myFunction()
}

// Use the open keyword in front of the superclass/parent,
// to make this the class other classes should inherit properties and functions from.

// To inherit from a class, specify the name of the subclass, followed by a colon :, and then the name of the superclass

// Inheritance is useful for code reusability: reuse properties and functions of an existing class when you create a new class
