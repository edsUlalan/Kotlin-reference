class Car(var brand: String, var model: String, var year: Int) {
  // Class function
  fun drive() {
    println("Wroom!")
  }
}

fun main() {
  val c1 = Car("Ford", "Mustang", 1969)
  // call the function
  c1.drive()
}

// just like with regular functions, you can pass parameters to a class function:

class Car(car brand: String, var model: String, var year: Int) {
  // class function
  fun drive() {
    println("Wroom")
  }

  // class function with parameters
  fun speed(maxSpeed: Int) {
    println("Max speed is: " + maxSpeed)
  }
}

fun main() {
  val c1 = Car("Ford", "Mustang", 1969)

  c1.drive()
  c1.speed(200)
}
