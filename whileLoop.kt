// the code in the loop will run, over and over again, as long as the counter variable (i) is less than 5:

var i = 0
while (i < 5) {
  println(i)
  i++
}

// the loop will always be executed at least once,
// even if the condition is false, because the code block is executed
// before the condition is tested

var i = 0
do {
  println(i)
  i++
}
while (i < 5)

// *do not forget to increase the variable used in the condition, otherwise the loop will never end!
