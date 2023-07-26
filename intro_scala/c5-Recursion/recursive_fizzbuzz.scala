//fizz buzz game using recursion
def fizzBuzz(i:Int):Unit = {
    if (i <= 100) {
        (i%3, i%5) match {
            case (0,0) => println("fizzbuzz")
            case (0,_) => println("fizz")
            case (_,0) => println("buzz")
            case _ => println(i)
        }
        fizzBuzz(i+1)
    }
}

@main
def main():Unit = {
    println(fizzBuzz(96))
}