
class Account(
    val name:String,
    val accountNo:String,
    var accountBalance:Double,
    val address: String,
    val contactNo: String,
) {

    fun desposite(depositeAmount: Double) {

        accountBalance += depositeAmount
        println("$depositeAmount is credited in your account your new balance is $accountBalance ")

    }

   fun withdrawal(withdrawalAmount:Double){

       if (accountBalance - withdrawalAmount < 0.0){
           println("You have $accountBalance in your account. insufficient fund to withdrawal")
       }else{
           accountBalance -= withdrawalAmount
           println("$withdrawalAmount is debited from your account. your remaining balance is $accountBalance")
       }

   }

    fun balanceEnquiry(){
        println("Your account balance is $accountBalance")
    }
}


fun main(){

    val account = Account("Sandeep Sharma", "62287668060",50.0,"Parbhani","8866558899")

    account.balanceEnquiry()
    account.desposite(1000.0)
    account.withdrawal(500.0)
    account.balanceEnquiry()
    account.desposite(1000.0)
    account.balanceEnquiry()
    account.withdrawal(2500.0)


}

