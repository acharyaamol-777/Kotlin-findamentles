fun main(args: Array<String>) {
    try{
        var num = 10/0
        println(num)
    }
    catch(e: NumberFormatException){
        println("Number format exception")
    }
    catch(e: ArithmeticException){
        println("Array index is out of range")
    }
    catch(e: Exception){
        println("Some Exception occurred")
    }

    println("Out of try catch block")
}