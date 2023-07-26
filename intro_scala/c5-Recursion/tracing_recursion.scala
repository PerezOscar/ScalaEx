//factorial fuunction
def fact(n:Int):Int = if (n<2) 1 else n*fact(n-1)

@main
def main():Unit = {
    println(fact(8))
}