package builders

fun main() {
    println("Let's do it!")
    
    /***** FIRST. Implicit Constructor in Task class *****/
    class Task{
        var name:String = ""
        fun taskFunction(name:String){
            this.name = name
            println("")
            println("FIRST.")
            println("")
            println("I am accessing the class Task with constructor Implicit to "
                            +"which I have assigned value to the class name "
                    + "variable after instantiating it and through the class " +
                            "function. ")
            println("value given to the name variable: $name ")
        }
        //How was the builder if this was written with Java
        /*public Task(String name, String type){
    	this.name = name
        this.type = type
    	}*/ 
    }
    
    class Collection {
        var name:String = ""
        
        /***** FIST. Calling to the implicit builder of Task class*****/
        var taskObject:Task = Task()
        var giveMeFunctionTaskClass = taskObject.taskFunction(name = "Doing " +
                "your homeworks")
    }

    var collectionObject = Collection()
    var varFuncObject = collectionObject.giveMeFunctionTaskClass
    println (varFuncObject)
    
    /***** SECOND. Explicit Builder (the word "constructor" is optional) *****/
    class State constructor (made:Boolean = false, toDo:Boolean =
        true){
        var made:Boolean = made
        var toDo:Boolean = toDo
        fun stateFunction(){
            println("") 
            println("SECOND.")
            println("")
            println("I'm accessing to the State class with implicit builder " +
                            "whose I've changed the values of variables of " +
                            "the class when instantiating it")

            println("value give to made: $made and toDo: $toDo ")
        }
    }    
    /***** SECOND. Instantiate the State class through the explicit builder *****/
    //var StateObject = State()
    /*This error occurs because no values have been assigned to the
    parameters of the Explicit constructor (done and toDo) */
    var stateObject = State(made = true, toDo = false)
    stateObject.stateFunction()
    
    /***** THIRD. Using the constructor():this method to assign values to the
     * constructor's parameters.*****/
    class User constructor (name:String, membership:String){
        var name:String = name
        var membership:String = membership

        /*This way it does not give an error because no values have been
        assigned to the parameters of the Explicit constructor.*/
        constructor():this(name="", membership=""){
        }
    }
    /*I could to instantiate the class on this way and it would give not an
    error: var userObject = User() */
    var userObject = User(name = "James", membership = "Premium")
    var objectName = userObject.name
    var objectMembership = userObject.membership
    		println("")
            println("THIRD.")
            println("")
            println("I'm accessing to the User class with the explicit " +
                            "builder declared in the class")
            println("value given to the name variable: $objectName and value " +
                            "given to the membership variable: " +
                            "$objectMembership")
}