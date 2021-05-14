
fun main(){
    var userType:String = "Editor"

    when(userType){
        "Admin" ->{
            println("Hey you are admin")
        }
        "Editor" ->{
            println("Hey you are editor")

        }
        "Author" ->{
            println("Hey you are author")

        }
        else ->{
            println("Hey you are subscriber")

        }
    }
}