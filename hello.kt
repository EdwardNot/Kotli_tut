
//! Hello world
// fun main(){
//     println("Hello world!")
// }

//! Vars and simple operations
// fun main(){
//     var a: Int = 1
//     println("The value of a is $a")
//     val b: Int = 2 // not changable (const)

//     val wholeNumber = 3
//     val bigNumber = 3L

//     val preciseDecimal = 3.33
//     val decimal = 3.33f

//     val boolValue = true

//     val charecter = 'a'

//     val x = 1 + 1

//     if (x == 2){
//         println("first")
//     } else if (x > 2 || x == -2){
//         println("second")
//     } else {
//         println("third")
//     }

//     val y = if(x==2) 2 else 3
// }

//! Working with null
// fun main(){
//     val x: Int? = null //nullable
//     val UserInput = readLine() ?: "0"
//     val UserInput2 = readLine() ?: "0"

//     val result = UserInput!!.toInt() + UserInput2!!.toInt()
//     // "!!" using to tell compiler that var is not null
//     print("This is a result: $result")
// }


//! Arrays loops and ranges
// fun main() {
//     val list = listOf<String>("String1" , "String2", "String3")
//     val mutable = mutableListOf<String>("String1", "String2", "String3")

//     mutable.add("String4")

//     var counter = 0
//     while(counter < list.size){
//         println(list[counter])
//         counter++
//     }

//     for(item in mutable){
//         println(item)
//     }

//     for(i in 1..10){
//         println(i)
//     }

//     val x = 3
//     when(x){
//         in 1..2 -> println("x between 1 and 2")
//         in 3..10 -> println("x between 3 and 10")
//         else -> {
//             println("x is not in range from 1 to 10")
//         }
//     }
// }

//! Functions
// fun main(){
//     print10Numbers()

//     val x = isEven(5)
//     val y = isEven()
//     val z = isEven(number = 2)

//     val a = 3
//     println(a.isOdd())
// }

fun print10Numbers(){
    for (i in 1..10){
        println(i)
    }
}

fun isEven(number: Int = 10): Boolean{
    return number % 2 == 0
}

fun Int.isOdd(): Boolean {
    return this % 2 == 1
}

// fun main(){
//     // Anon class
//     val bear = object : Animal("bear") {
//         override fun make_sound(){
//             println("RRRRR")
//         }
//     }
// }

//! Try catch
// fun main(){
//     val number = readLine() ?:"0"
//     val parsedNumber: Int = try{
//         number.toInt()
//     }catch(e: Exception){
//         0
//     }
// }

//! Featers
fun main(){
    val list = listOf("Kotlin", "is", "fun")
    val count = list.count {
        currentString -> currentString.length == 3
    }

    print(count)
}

fun <T> List<T>.customCount(function: (T) -> Boolean): Int {
    var counter = 0
    for (string in this){
        if (function(string)){
            counter++
        }
    }
    return counter
}