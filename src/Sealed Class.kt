sealed class Fruit(
    val x: String
){
    class Apple: Fruit("Apple")
    class Mango: Fruit("Mango")
}

class WaterMelon: Fruit("watermelon")

fun display(fruit: Fruit){
    when(fruit)
    {
        is Fruit.Apple -> println("${fruit.x} is good for iron")
        is Fruit.Mango -> println("${fruit.x} is delicious")
        is WaterMelon -> println("${fruit.x} is good for vitamin d")
    }
}

fun main(){

    val obj = Fruit.Apple()
    val obj1 = Fruit.Mango()
    val obj2 = WaterMelon()

    display(obj)
    display(obj1)
    display(obj2)
}