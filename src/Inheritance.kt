
open class Shape(
    private val height: Int,
    private val width: Int,
    private val length: Int
){
    fun drawShape(){
        println("Shape is drawn")
    }
}

class Reactangle (
    private val height: Int,
    private val width: Int,
    private val length: Int
        ): Shape(height,width,length){

            fun drawReactangle(){
                println("Reactangle is drawan..")
            }

}

fun main(){
   val circle = Reactangle(10,10,10)
    circle.drawShape()
    circle.drawReactangle()
}