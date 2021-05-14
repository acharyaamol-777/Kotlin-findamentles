
/* fun rollDice(
    range:IntRange,
    times:Int,
    callback:(result: Int)->Unit
){
    for (i in 0 until times){
        val result = range.random()
        callback(result)
    }
}

fun main(){
    rollDice(1..6,4)
    //Trailing lambda
    { result ->
        println(result)
    }
} */

/* fun func(str: String, myfunc:(String)->Unit){

    print("hello welcome to kotlin ")
    myfunc(str)
}

fun demo(str: String){
    println(str)
}

fun main(){
    func("Basics Tutorials", :: demo)
} */

fun func(num: Int): (Int)-> Int = {num2 -> num2 + num}

fun main(){

    val sum = func(10)
    println("Sum is ${sum(20)}")
}