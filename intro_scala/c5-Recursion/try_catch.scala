import io.StdIn._

def safeReadint:Int ={
    try {
        readInt
    } catch {
        case error:NumberFormatException => println("That wasnt a valid Int. Please try again")
        safeReadint
    }
}

@main
def main():Unit = {
    val i = safeReadint
    println(i)
}
