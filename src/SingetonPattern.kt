//class Manager private constructor(){
//
//    companion object{
//        private var instance: Manager? = null
//
//       operator fun invoke() = synchronized(this){
//
//            if (instance == null)
//                instance = Manager()
//            instance
//
//        }
//
//    }
//
//}

object Manager{
    init {
        println("Manager object is initialized")
    }
}



fun main(){
    println(Manager)

}