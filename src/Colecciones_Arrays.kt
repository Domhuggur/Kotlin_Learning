 
	/***** Clase Tarea desde fuera de la fun main() *****/
    class Tarea(val nombre:String, val tipos:Array<Tipo>){
        //var nombre:String = nombre
        //var tipo:String = ""
        //var cantidad:Int = 0
        //var realizada:Boolean = false
        //var porRealizar:Boolean = true
        enum class Tipo {
            Diarias,
            Semanales,
            En_este_mes,
            Por_hacer
        }
        func dimeTipoTarea(){
            for (tipotipo:Tipo in tipos){
                println("El tipo de tarea es $tipotipo")
            }
        }
    }
    
    fun main() {
    println("Vamos a darle a las colecciones y los arrays!") 
	
	fun dimeTarea(){
        val objetoTarea = Tarea(nombre:"deberes", arrayOf(Tarea.Tipo.Diarias))
        //var listaTareas:MutableList<Tarea> = mutableListOf()
        //listaTareas.add(objetoTarea)
    }
}    