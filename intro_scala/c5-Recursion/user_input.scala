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

@main
def main():Unit = {
    val (s,c)=sumAndCount()
    println(s/c.toDouble)
}
