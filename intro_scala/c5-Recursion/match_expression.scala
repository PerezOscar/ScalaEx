def fact(n:Int):Int = if (n<2) 1 else n*fact(n-1)

def sumSquares(n:Int):Int = if (n<2) 1 else n*n+sumSquares(n-1)

/*
expr match {
    case pattern1 => ... 
    case pattern2 => ...
    ...
}

(a,b) match {
    case (0,0) ...
    case (0,1) ...
    case (1,0) ...
    case (0,n) ... if n%2 == 0 =>
    case (1,n) ... if n%2 == 1 =>
}

*/

def fact2(n:Int):Int = n match {
    case 0 => 1
    case _=> n*fact2(n-1)
}

def sumSquares2(n:Int):Int = n match {
    case 0 => 1
    case _ => n*n+sumSquares(n-1)
}

//without a pattern
readInt match {
    case 1 => println("Its 1")
    case 2 => println("Its 2")
    case 3 => println("Its 3")
    case n => orintln("Something else. "+n)
}

@main
def main():Unit = {
    println(fact2(5))
    println(sumSquares2(5))
}
