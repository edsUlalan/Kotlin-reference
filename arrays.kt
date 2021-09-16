// To create an array, use the arrayOf() function, and place the values in a comma-separated list inside it

val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")

// access the elements of an array

println(cars[0]) // outputs Volvo

// change an array element

cars[0] = "Opel"
println(cars[0]) // outputs Opel

// array length / size

val models = arrayOf("Volvo", "BMW", "Ford", "Mazda")
println(models.size) // outputs 4

// check if an element exists
// You can use the in operator to check if an element exists in an array

if ("Volvo" in models) {
  println("It exists!")
} else {
  println("It does not exist.")
}

// loop through an array

for (x in models) {
  println(x)
}
