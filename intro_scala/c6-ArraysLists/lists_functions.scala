import io.StdIn._
//lists are unmutable
def inputList(n:Int):List[Int] = {
    if (n<1) Nil else readInt::inputList(n-1)
}

@main
def main():Unit ={
    println(inputList(5))
}