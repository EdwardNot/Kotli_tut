abstract class Animal(
    val name: String,
    val legcount: Int = 4
) {

    init {
        println ("My name is $name")
    }

    abstract fun make_sound()
}

open class Dog: Animal("Dog"){
    init{
        println(legcount)
    }

    override fun make_sound(){
        println("Wuff!!")
    }

    fun biteTail(){
        println("I am biting my tail!")
    }
}

class GoodDoggy: Dog(){
    
}

class Cat: Animal(name = "Cat"){
    fun purring(){
        println("PRRRRRRR")
    }

    override fun make_sound(){
        println("Meow")
    }
}