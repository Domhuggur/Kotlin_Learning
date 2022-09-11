package functions

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
    fun voidFunction(){
        print("This is a void function")
    }
}