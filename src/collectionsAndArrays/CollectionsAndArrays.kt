package collectionsAndArrays

import java.lang.reflect.Type

/***** Clase Tarea desde fuera de la fun main() *****/
    class CollectionsAndArrays(val name:String, val type:Array<Type>){
        //var nombre:String = nombre
        var tipo:String = ""
        //var cantidad:Int = 0
        //var realizada:Boolean = false
        //var porRealizar:Boolean = true
        enum class Type {
            Diarias,
            Semanales,
            En_este_mes,
            Por_hacer
        }
        fun giveMeType(){
            for (typetype:Type in type){
                println("El tipo de tarea es $typetype")
            }
        }
    }
    
    fun main() {
    println("Vamos a darle a las colecciones y los arrays!") 
	
	fun giveMeTaks(){
        val objetoTarea = CollectionsAndArrays(name:"deberes", arrayOf
        (CollectionsAndArrays.Type.Diarias))
        //var listaTareas:MutableList<Tarea> = mutableListOf()
        //listaTareas.add(objetoTarea)
    }
}    