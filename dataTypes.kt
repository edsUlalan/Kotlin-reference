val myNum = 5 // Int
val myDoubleNum = 5.99 // Double
val myLetter = 'D' // Char
val myBoolean = true // Boolean
val myText = "Hello" // String

// or you can do this
val myNum: Int = 5
val myDoubleNum: Double = 5.99
val myLetter: Char = 'D'
val myBoolean: Boolean = true
val myText: String = "Hello"

// Integer Types
val myNum: Byte = 100
println(myNum)
// The Byte data type can store whole numbers from -128 to 127.
This can be used instead of Int or other integer types to save memory when you are certain that the value will be within -128 and 127

val myNum: Short = 5000
println(myNum)
// The Short data type can store whole numbers from -32768 to 32767

val myNum: Int = 100000
println(myNum)
// The Int data type can store whole numbers from -2147483648 to 2147483647

val myNum: Long = 15000000000L
println(myNum)
// The Long data type can store whole numbers from -9223372036854775808 to 9223372036854775808.
This is used when Int is not large enough to store the value. Optionally, you can end the value with an "L"

val myNum: Float = 5.75F
println(myNum)
// The Float data type can store fractional numbers from 3.4e−038 to 3.4e+038. Note that you should end the value with an "F"

val myNum: Double = 19.99
println(myNum)
// The Double data type can store fractional numbers from 1.7e−308 to 1.7e+038

val myNum1: Float = 35E3F
val myNum2: Double = 12E4
println(myNum1)
println(myNum2)
// Scientific numbers

// Booleans
val isKotlinFun: Boolean = true
val isFishTasty: Boolean = false
println(isKotlinFun)
println(isFishTasty)

// Characters
val myGrade: Char = 'B'
println(myGrade)

// Strings
val myText: String = "Hello World"
println(myText)

// Arrays
// Type Conversion
val x: Int = 5
val y: Long = x
println(y) // Error: Type mismatch

val x: Int = 5
val y: Long = x.toLong()
println(y)

// To convert a numeric data type to another type, you must use one of the following functions:
toByte(), toShort(), toInt(), toLong(), toFloat(), toDouble() or toChar()
