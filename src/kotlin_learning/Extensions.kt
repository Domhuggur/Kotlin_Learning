//https://kotlinlang.org/docs/extensions.html
package kotlin_learning

import java.text.SimpleDateFormat
import java.util.*

/* We can use Extensions for change the funcionability of the classes without
* use herency*/

/* We're going to use the class Date belonging to java.util and adding a
* function created by us (customFormat) which is going to be added to the
* class */
class Extensions{
}

fun Date.customFormat(): String{
    /* We create a variable where store the class SimpleDateFormat (which
    extends DateFormat class) with a variables with variables which are
    the format of the date */
    val formatter = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZZZ",
                                     Locale.getDefault())
    return formatter.format(this)
}
/*This function is going to be called from the MainActivity class*/
