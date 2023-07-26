/*Reduce an imperial measurement so that it is expressed
using the largest possible units of measure. For example:
59 teaspoons is reduced to 1 cup, 3 tablespoons, 2 teaspoons.
*/

import scala.math._
import io.StdIn._

//teaspoons per tablespoons
val TSP_PER_TBSP = 3
//teaspoons per cup
val TSP_PER_CUP = 48

/* Reduce an imperial measurement so that it is expressed using
the largest possible units of measure
@param nu m the number of units that need to be reduced 
@param unit the unit of measure (cup, tablespoon, or teaspoon)
@returrn a string representing the measurement in the reduced form
*/

def reduceMeasure(num:Int,unit:String):Int = {
    //Compute the number of teaspoons that the parameters represent
    val unitlow = unit.toLowerCase.trim

    if ( unitlow == "teaspoon" | unitlow == "teaspoons" ) {
        val teaspoons = num 
    }
    else if (unitlow=="tablespoon" | unitlow == "tablespoons")  {
        val teaspoons = num * TSP_PER_TBSP
    }
    else if (unitlow == "cup" | unitlow == "cups") {
        val teaspoons = num * TSP_PER_CUP
    }


    //Convert the number of teaspoons to the largest possible 
    //units of measure

    val cups = floor(teaspoons/TSP_PER_CUP)
    val teaspoons = teaspoons - cups * TSP_PER_CUP
    val tablespoons = floor(teaspoons / TSP_PER_TBSP)
    val teaspoons = teaspoons - tablespoons * TSP_PER_TBSP
    
    //Generate the result string (if any)
    val result = ""

    //Add the number of cups to the result string (if any)
    if (cups>0) {
        val result = result + cups.toStrimg + " cup"
        if (cups > 1) result = result + "s" 
    }



}

@main
def main():Unit = {
    println("59 teaspoons is "+ reduceMeasure(59,"teaspoons").toString)
}