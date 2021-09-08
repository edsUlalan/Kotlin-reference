var name = "John" // var declaration can be changed/modified
val birthyear = 1975 // val declaration cannot be changed

// this works fine
var name: String
name = "John"
println(name)

// this will generate an error
var name
name = "John"
println(name)

// display variables
val name = "John"
println("Hello" + name)

val firstName = "First"
val lastName = "Last"
val fullName = firstName + lastName
println(fullName)

val x = 5
val y = 6
println(x + y)
