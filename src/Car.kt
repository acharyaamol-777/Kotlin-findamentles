
class Car(val name: String, val type: String, val kmRun: Int)
{
    fun drive(){
        println("Car is drived...")
    }

    fun applyBreaks(){
        println("Breaks are applied...")
    }
}

fun main(){

    val swift = Car("Swift","petrol",100)
    val lamborghini = Car("Lamborghani","Disel",200)
    println(swift.type)
    println(lamborghini.name)
    lamborghini.applyBreaks()
    swift.drive()
    swift.applyBreaks()
}