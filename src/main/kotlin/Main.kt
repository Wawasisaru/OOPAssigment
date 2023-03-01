fun main(){
    var self = Human("Nancy", 20, 58)
    self.eat(5)
    self.weight
    self.speak("I Am Nancy")
    self.birthday()
    var myPerson = Person("Nancy","Saru","nsaruwawasi@gmail.com",706007173,"wasi@17173")
    println(myPerson.email)
    println(myPerson.password)


}

class Human(var name: String, var age:Int, var weight:Int) {
    fun eat(foodWeight: Int) {
        println("I am eating${foodWeight}kgs of food")
        weight += foodWeight
        println("My weight is ${weight}  kgs")

    }

    fun speak(speech: String) {
        println("I a young strong woman.")
    }

    fun birthday() {
        println("I am ${age} years old")
    }
}
data class Person( var firstName: String, var lastName: String, var email: String, var phoneNumber: Int, var password: String ){

}







