// With the for loop, you can also create ranges of values with ".."

for (chars in 'a'..'x') {
  println(chars)
}

for (nums in 5..15) {
  println(nums)
}

// check if a value exists using "in"

val numbers = arrayOf(2, 4, 6, 8)
if (2 in nums) {
  println("It exists!")
} else {
  println("It does not exist.")
}

val models = arrayOf("Volvo", "BMW", "Ford", "Mazda")
if ("Volvo" in cars) {
  println("It exists!")
} else {
  println("It does not exist.")
}

// break of or continue a range
// Stop the loop when nums is equal to 10
for (nums in 5..15) {
  if (nums == 10) {
    break
  }
  println(nums)
}

// Skip the value of 10 in the loop, and continue with the next iteration
for (nums in 5..15) {
  if (nums == 10) {
    continue
  }
  println(nums)
}
