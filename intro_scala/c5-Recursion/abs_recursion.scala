import io.StdIn._

def sumUntilQuit():Int = {
    val input = readLine.toLowerCase.trim
    if (input == "quit") 0 
    else input.toInt + sumUntilQuit()
}

def sumAndCount():(Int,Int) = {
    val input = readLine.toLowerCase.trim
    if(input=="quit") (0,0)
    else {
        val (sum,count) = sumAndCount()
        (input.toInt+sum,count+1)
    }
}

def multiAndCount():(Int,Int) = {
    val input = readLine.toLowerCase.trim
    if(input=="quit") (1,0)
    else {
        val (prod,count) = multiAndCount()
        (input.toInt*prod,count+1)
    }
}

// This is the abstraction recursion for the above examples
def inputAndCount(base:Int,op:(Int,Int)=>Int):(Int,Int) = {
    val input = readLine.toLowerCase.trim
    if(input=="quit") (base,0) // a base
    else {
        val (value,count) = inputAndCount(base,op)
        (op(input.toInt,value),count+1) // an operation
    }
}

@main
def main():Unit = {
    val (s,c)=inputAndCount(Int.MaxValue,_ min _)
    println(s+ "  "+c)
}
