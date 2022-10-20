package aLittleOfEveryThing

class ALittleOfEveryThing {
}

// --- 1. Introduction ---
//--> 1.1. Hello world
fun main() {
    println("Hello, world!!!")
    //To understand this go to ==> 1.5. Classes
    val person1 = BodyAndHeadIsGreat("squareHead", "butCurvyBody")
    println(person1)
    //To understand this go to ==> 1.6. Inheritance
    val suitMan1 = executive()
    println(suitMan1.giveMeSalary())
    val workMan1 = worker()
    println(workMan1.giveMeSalary())
}
//--> 1.2. Funciones
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
//--> 1.3. Variables
class Variables{
    val number:Int = 1
    val otherNumber = 2 //Inferred Int
    val anotherUmmWordThisTime:String = "Beeep" //I wanna be human

    var anotherNumber:Int = 3
    var anotherNumber:Int = 1 //'var' keyword is used to reassigned a variable
}
//--> 1.4. Null Safety
class NullSafety{
    var neverNull: String = "This can't be null"
    neverNull = null
    var nullable: String? = "You can keep a null here"
    nullable = null
}
//--> 1.5. Classes
class NoBodyNoParty// No header and no body so no brakes and no curly braces
class NoHeadNoWorry(val id: Int, var email: String)// No body no curly braces
class BodyAndHeadIsGreat(val head:String, var body:String){
    /*Like this way we can instanciate the class in the ***main method*** (see there)
     * and give values to the parameters*/
}
//--> 1.6. Inheritance
open class employee(){
    var salary:Int = 0
    public fun giveMeSalary(){
        println("The salary is: $salary eurodollars")
    }
}
class executive:employee(){
    override var salary = 80000
}
class worker:employee(){
    override var salary = 30000
}
/*Now you can see in the ***main method***  how when we instanciate a class which is
 * hereditary from other and you put the keyword 'override' you can change the
 * value of a variable or method*/