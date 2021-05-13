fun main() {

    var cars = mutableListOf<Car>(Car("Toyota","Subaru","blue"),
        Car("Toyota","Mazda","red"),
        Car("Toyota","Audi","purple"),
        Car("Toyota","Mercedes","blue"))
    findColoredCar(cars)


  println(findLength("Junitter"))

    var account = CurrentAccount(479865239559,"Johnson",34000.00)
    account.deposit(50000.00)
    account.withdraw(30000.00)
    account.details()

    var account2 = SavingsAccount(479865239559,"Johnson",34000.00,10)
    account2.deposit(50000.00)
    account2.withdraw(30000.00)
    account2.details()
    account2.withdrawals()

}
data class Car(var make:String, var model:String,var color:String)
fun findColoredCar(cars:List<Car>){
     var redCars = mutableListOf<Car>()
    var blueCars = mutableListOf<Car>()
    var others = mutableListOf<Car>()


    var mycolor = cars.forEach { car ->  car.color}
    println(mycolor)
    when (mycolor) {
        "red"  -> redCars.plus(cars)
        " blue" -> blueCars.plus(cars)
        else -> others.plus(cars)
    }
}

fun findLength(word:String):Int{
   return word.length
}
class CurrentAccount(var accNumber: Long, var accName:String, var balance:Double){
    fun deposit(amount: Double){

    }
    fun withdraw(amount: Double){
        balance-=amount
    }
    fun details(){
        println("Account number ${accNumber} with balance ${balance} id operated by ${accName}")
    }

}
class SavingsAccount(var accNumber: Long, var accName:String, var balance:Double, var withdrawals:Int){
    fun deposit(amount: Double){
        balance+=amount
    }
    fun withdraw(amount: Double){
        balance-=amount
    }
    fun details(){
        println("Account number ${accNumber} with balance ${balance} id operated by ${accName}")
    }
    fun withdrawals() {
        if (withdrawals<4 ){
            withdrawals++
        }
    }
}
