/* The while loop evaluates the condition 
then executes the body

while (condition) {
    body
}
*/

import io.StdIn._

def readInts:List[Int] = {
    var input = readLine
    var lst = List[Int]()
    while (input != "quit") {
        lst ::= input.toInt
        input = readLine
    }
    lst.reverse
}

@main 
def main():Unit = {
    println(readInts)
}
