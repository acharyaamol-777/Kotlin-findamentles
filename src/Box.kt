
class Box(
    var length : Int = 10,
    var width : Int = 10,
    var height : Int = 10
){
    init {

        val volume = length * width * height
        println("volume of box is $volume")
    }


    fun fillBox(){
        println("Box is filled")
    }

    fun openBox(){
        println("Box opened")
    }

}

fun main(){

    val b = Box(10,5,5)
    b.openBox()
    b.fillBox()

}