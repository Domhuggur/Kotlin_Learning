package mainActivity

import functions.Functions

class MainActivity {

}
fun main() {
    var objectFunctions: Functions = Functions()
    var giveMeFunctionsObject = objectFunctions.voidFunction()
    fun printMeVar() {
        print(giveMeFunctionsObject)
    }
}
