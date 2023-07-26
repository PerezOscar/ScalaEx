/* 
Compute the perimeter of a polygon. 
The user will enter a blank line
for the x-coordinate to indicate 
that all of the points have been entered
*/

import scala.math._
import io.StdIn._

//pedimos el valor inicial
val x0 = readInt
val y0 = readInt

def distance():Double = {
    val (x,y) = (readLine.toLowerCase.trim,readLine.toLowerCase.trim)
    if ((x,y) == ("","")) 0 else {
        val a=x0-x.toInt
        val b=y0-y.toInt
        // asignar los valores de coordenadas iniciales
        // a los valores globales x0y0 investigar como hacerlo 
        // sin usar variables globales
        sqrt(pow(a,2)+pow(b,2)) + distance()
}

@main 
def main():Unit = {
    println(distance())
}
