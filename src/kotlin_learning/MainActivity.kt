package kotlin_learning
import java.util.*

class MainActivity {
    private fun extensions(){
        val myDate = Date()
        println(myDate.customFormat())
    }
}
fun main() {
    var objectFunctions: Functions = Functions()
    var giveMeFunctionsObject = objectFunctions.voidFunction()
    fun printMeVar() {
        print(giveMeFunctionsObject)
    }

}
