/*
    (do while is no longer supported on scala 3)
    
do while loop hit the body first and then checks 
the condition. so do while executes the body at least
once

do {
    body
} while (condition)

*/
import io.StdIn._

def printMenu:Unit = {
    println("""
    1. Enter a test grade
    2. Enter an assignment grade
    3. Print Average
    4. Quit
    """)
}

def calcAverage(tests:List[Int],assns:List[Int]):Double = {
// test extreme conditions like 
val testAvg = if (tests.length<1) 0 else tests.sum/tests.length
val assnAvg = if (assns.length<1) 0 else assns.sum/assns.length
//0.5*tests.sum/tests.length+0.5*assns.sum/assns.length
0.5*testAvg+0.5*assnsAvg
}

@main
def main():Unit = {

    var testGrades = List[Int]()
    var assnGrades = List[Int]()
    var input = 0

    do {
        printMenu
        input = readInt
        input match {
            case 1 => 
                println("Enter a grade.")
                testGrades::=readInt
            
            case 2 => 
                println("Enter a grade.")
                assnGrades::=readInt

            case 3 => 
                println(s"The average is ${calcAverage(testGrades,assnGrades)}.")
            
            case 4 => //do nothing

            case _ => println("What was that?")
        }
    } while (input!=4)
}
