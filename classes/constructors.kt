class Car {
  var brand = ""
  var model = ""
  var year = 0
}

fun main() {
  val c1 = Car()
  c1.brand = "Ford"
  c1.model = "Mustang"
  c1.year = 1969
}

// there's a faster way of doing this, by using a constructor
// A constructor is like a special function, and it is defined by using two parantheses () after the class name.
// You can specify the properties inside of the parantheses (like passing parameters into a regular function).
// The constructor will initialize the properties when you create an object of a class.
// Just remember to specify the type of the property/variable

class Car(var brand: String, var model: String, var year: Int)

fun main() {
  val c1 = Car("Ford", "Mustang", 1969)
}

class CarTwo(var brand: String, var model: String, var year: Int)

fun main() {
  val c1 = CarTwo("Ford", "Mustang", 1969)
  val c2 = CarTwo("BMW", "X5", 1999)
  val c3 = CarTwo("Tesla", "Model S", 2020)
}
