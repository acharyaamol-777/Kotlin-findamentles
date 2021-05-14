 class ArrayUtils<T>(text: T){

     var x = text

     init {
         println(x)
     }
 }

 fun main(){
     var name:ArrayUtils<String> = ArrayUtils("GeeksForGeeks")
     var rank:ArrayUtils<Int> = ArrayUtils(56)
 }