interface Bird {
    /* An Interface can't be instantiate therefore no constructor can be defined*/
    var energy: Int
    fun fly(minutes:Int){
        energy = energy - (minutes * 2)
    }
}
class Falcon(override var energy: Int = 100) : Bird{
    /*Variable override in Kotlin refers to the possibility for a subclass to
    have variables with the same name as those of a parent class but which
    define different values.*/
    fun eat (grams:Int){
        energy = energy + (grams * 4)
    }
}