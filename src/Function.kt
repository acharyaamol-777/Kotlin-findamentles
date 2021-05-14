
fun main(){

    val result = add(5,6)
    println(result)

    evenOrOdd(45)

    subs()
}

fun add(num1: Int, num2:Int):Int{
    val sum = num1 + num2
    return sum
}

fun evenOrOdd(num:Int){
    val result = if (num % 2 == 0) "Even" else "Odd"
    println(result)
}

fun subs(){
    val a:Int = 80
    val b: Int = 60
    val subs: Int = a - b
    println(subs)
}