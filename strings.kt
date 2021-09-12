var greeting = "Hello"
var greeting: String = "Hello"

// access a String

var txt = "Hello World"
println(txt[0]) // first element (H)
println(txt[2]) // third element (l)

// string length

var txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
println("The length of the txt string is: " + txt.length)

// string functions

var txt = "Hello World"
println(txt.toUpperCase()) // outputs "Hello World"
println(txt.toLowerCase()) // outputs "hello world"

// comparison Strings

var txt1 = "Hello World"
var txt2 = "Hello World"
println(txt1.compareTo(txt2)) // Outputs 0 (they are equal)

// finding a string in a String

var txt = "Please locate where 'locate' occurs!"
println(txt.indexOf("locate")) // outputs 7

// quotes inside a String
var txt1 = "It's alright"
var txt2 = "That's great"

// string concatenation
var firstName = "John"
var lastName = "Doe"
println(firstName + " " + lastName)

// using plus()

var firstName = "John"
var lastName = "Doe"
println(firstName.plus(lastName))

// string interpolation/templates
var firstName = "John"
var lastName = "Doe"
println("My name is $firstName &lastName")
