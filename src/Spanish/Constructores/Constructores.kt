fun main() {
    println("Vamos a darle a instanciar las clases con los constructores!") 
    
    /***** PRIMERO. Constructor Implicito Tarea *****/
    class Tarea{
        var nombre:String = ""
        fun funcionTarea(nombre:String){
            this.nombre = nombre
            println("")
            println("PRIMERO.")
            println("")
            println("Estoy accediendo a la clase Tarea con constructor Implicito a la cual le he asignado valor a la variable nombre de la clase despues de instanciarla y a traves de la funcion de la clase ")
            println("valor dado a la variable nombre: $nombre ")
        }
        //Como seria el Constructor Explicito si estuviera en JAVA     
        /*public Tarea(String nombre, String tipo){
    	this.nombre = nombre
        this.tipo = tipo 
    	}*/ 
    }
    
    class Coleccion{
        var nombre:String = ""
        
        /***** PRIMERO. Llamada al Constructor Implicito Tarea *****/
        var objetoTarea:Tarea = Tarea()
        var dameFuncionClaseTarea = objetoTarea.funcionTarea(nombre = "Hacer los deberes")
        
    }
    var objetoColeccion = Coleccion()
    println(objetoColeccion.dameFuncionClaseTarea)
    
    /***** SEGUNDO. Constructor Explicito en KOTLIN (la palabra Constructor es opcional) *****/
    class Estado constructor (realizada:Boolean = false, porRealizar:Boolean = true){
        var realizada:Boolean = realizada
        var porRealizar:Boolean = porRealizar
        fun funcionEstado(){
            println("") 
            println("SEGUNDO.")
            println("")
            println("Estoy accediendo a la clase Estado con constructor Explicito a la cual le he cambiado los valores de las variables de la clase al instanciarla") 
            println("valor dado a realizada: $realizada y a porRealizar: $porRealizar ")
        }
    }    
    /***** SEGUNDO. Instanciar la clase Estado mediante el constructor Explicito *****/
    //var objetoEstado = Estado() /*Asi da error porque no se han asignado valores a los parametros del constructor Explicito (realizada y porRealizar)*/ 
    var objetoEstado = Estado(realizada = true, porRealizar = false)
    objetoEstado.funcionEstado()
    
    /***** TERCERO. Utilizar el metodo constructor():this para asignar valores a los parametros del constructor Explicito*****/
    class Usuario constructor (nombre:String, membresia:String){
        var nombre:String = nombre
        var membresia:String = membresia
        //De esta manera no da error porque no se hayan asignado valores a los parametros del constructor Explicito
        constructor():this(nombre="", membresia=""){            
        }
    }
    var objetoUsuario = Usuario(nombre = "Jacobo", membresia = "Premiun")
    //Podria instanciar la clase de esta manera y no daria error: var objetoUsuario = Usuario()
    var nombreObjeto = objetoUsuario.nombre
    var membresiaObjeto = objetoUsuario.membresia
    		println("")
            println("TERCERO.")
            println("")
            println("Estoy accediendo a la clase Usuario con el constructor Explicito declarado en la clase")
            println("valor dado a la variable nombre: $nombreObjeto y valor dado a la variable membresia: $membresiaObjeto")
}