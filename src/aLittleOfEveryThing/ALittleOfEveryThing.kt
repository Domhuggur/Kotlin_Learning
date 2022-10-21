package aLittleOfEveryThing

class ALittleOfEveryThing {
}
 fun main() {
     /*==> HELLO WORLD <==*/
     println("Hello, world!!!")

    /*==> NULL SAFETY <==*/
    var neverNull: String = "This can't be null"
    //neverNull = null
    var nullispossible: String? = "You can keep a null here"
    nullispossible = null //Is possible to change the value to null

     //To understand this go to ==> CLASSES
    val person1 = BodyAndHeadIsGreat("squareHead", "curvyBody")
    println(person1.giveMeHeadAndBody())

     //To understand this go to ==> INHERITANCE
    val suitMain1 = Executive()
     println(suitMain1.giveMeSalary())
     val workMan1 = Worker()
     println(workMan1.giveMeSalary())

}

/*==> FUNCTIONS <==*/
class Functions{
    fun whatTypeOfVariableItIs(type:Any):String{
        return when(type){
            is String -> "It's a variable of type String"
            is Int -> "It's a variable of type Int"
            is Float -> "It's a variable of type  Float"
            is Boolean -> "It's a variable of type  Boolean"
            else -> "It isn't a variable of known type"
        }
    }
}
/*==> VARIABLES <==*/
class Variables{
    val number:Int = 1
    val otherNumber = 2 //Inferred Int
    val anotherUmmWordThisTime:String = "Beeep" //I wanna be human
    var anotherNumber:Int = 3 //'var' keyword is used to reassigned a variable   
}

/*==> CLASSES <==*/
class NoBodyNoParty// No header and no body so no brakes and no curly braces
class NoHeadNoWorry(val id: Int, var email: String)// No body no curly braces
class BodyAndHeadIsGreat(val head:String, var body:String){
    /*Like this way we can instantiate the class in the ***main method*** (see there)
     * and give values to the parameters*/
    fun giveMeHeadAndBody(){
        println("The head is $head and the body is $body")
    }
}
/*==> INHERITANCE <==*/
open class Employee(val salary:Int = 0, var name:String = ""){

    open fun giveMeSalary(){
        println("The salary of the $name is: $salary eurodollars")
    }
}
class Executive(salary: Int = 80000, name:String = "executive"):Employee
                                                                    (salary,
                                                                     name){
}
class Worker(salary: Int = 40000, name: String = "worker"):Employee(salary,
                                                                    name){
}

/*Now you can see in the ***main method***  how when we instantiate a class which is
 * hereditary from other and you put the keyword 'override' you can change the
 * value of a variable or method*/
  
 
