

class Person(nameParam:String, ageParam:Int){
    var name:String = nameParam
    var age:Int = ageParam
    set(value) {
        if (value > 0){
            field = value
        }else{
            println("Age can't be nagative")
        }
    }
}

fun main(){
     val p = Person("Akansha",22)

    p.age=16
    println(p.age)
}