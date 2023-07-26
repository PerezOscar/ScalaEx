/*
Determine and display whether an integer 
entered by the user is even or odd
*/

import io.StdIn._

@main
def even():Unit = {
    //Read the integer from the user
    println("Enter an integer: ")
    val num = readInt
    if (num %2 == 1) println("Odd") else println("Even")
}