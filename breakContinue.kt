// break statement
// This example jumps out of the loop when i is equal to 4
var i = 0
while (i < 10) {
  println(i)
  i++
  if (i == 4) {
    break
  }
}

// continue statement
// breaks one iteration (in the loop), if a specified condition occurs,
// and continues with the next iteration in the loop

var i = 0
while (i < 10) {
  if (i == 4) {
    i++
    continue
  }
  println(i)
  i++
}
