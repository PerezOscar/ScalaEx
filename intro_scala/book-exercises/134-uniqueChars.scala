/* Compute the number of unique characters ina astring using a Map Iterable
*/

import io.StdIn._

def uniqueChars(s:String):Int = {
    var chars = Map[String,String]()
    for (c <- s) chars = chars + (c.toString->"True")
    chars.keysIterator.length
}

@main
def main():Unit = {
println("Enter a string: ")
val s = readLine
println("That string contained "+uniqueChars(s).toString+" unique characters")
}
