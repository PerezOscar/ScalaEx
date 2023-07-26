//Reduce a fraction to its lowest terms

/*
Compute the greatests common divisor of two integers
@param n the first integer under consideration 
@param m the second integer under consideration
@return the greatest commmon divisor of the integers
*/

import scala.math._
import io.StdIn._

def gcd(n:Int,m:Int):Int ={
    //Inicialize d to the smaller of n and m
    var d= min(m,n)
    while ( n%d!=0 | m%d != 0) {
        d=d-1
    }
    d
}

def reduce(num:Int, den:Int):(Int,Int) = {
    //If the numerator is 0 then the reduced fraction is 0/1
    if (num == 0) (0,1) else {
        val g = gcd(num,den)
        (floor(num/g).toInt,floor(den/g).toInt)
    } 
}

@main 
def main():Unit = {
    //Read the input from user
    println("Enter the numerator: ")
    val num = readInt
    println("Enter the denominator: ")
    val den = readInt

    //Compute the reduced fraction 
    val (n,d) = reduce(num,den)

    println(num+"/"+den+" can be reduced to "+n+"/"+d)
}
