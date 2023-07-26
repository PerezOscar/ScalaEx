/*
Compute the refund amount for a collection of bottles
*/
import io.StdIn._

//Read input from user
@main
def inputRead():Unit = {
    val LESS_DEPOSIT = 0.10
    val MORE_DEPOSIT = 0.15
    val less = readInt
    val more = readInt
    val refund = less*LESS_DEPOSIT + more*MORE_DEPOSIT
    println("Your total refund will be " + refund)
}
