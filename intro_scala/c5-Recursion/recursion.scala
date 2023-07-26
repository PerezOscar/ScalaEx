/*Note: bigint type uses too much memory
only use it when dealing with large numbers*/

//sum the squares from 1 to n
def squareSum(n:Int):Int = {
    if (n<2) 1 else n*n+squareSum(n-1)
}

//factorial of n 
def factorial(n:BigInt):BigInt =  {
    if (n<2) 1 else n*factorial(n-1)
}

def countDown(n:Int):Unit ={
    if (n>0) {
        println(n)
        countDown(n-1)
    }
}
def countFromTo(from:Int,to:Int):Unit = {
    if (from<=to) {
        println(from)
        countFromTo(from+1,to)
    }
}

@main
def main():Unit = {
    println(squareSum(3))
    println(factorial(3))
    println(countDown(10))
    println(countFromTo(1,10))
}
