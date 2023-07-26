//Read File with Source
import scala.io.Source

@main
def main():Unit = {

//we get a scala.io.BufferedSource = non-empty iterator
val source = Source.fromFile("fiveNums.txt")

// each iterator element are complete lines.
val lines = source.getLines

// convert line iterator to an array and print the results
// dont forget to create an array or list with the values 
// before closing the file in order to keep using the data
val nums = lines.filter(_.nonEmpty).map(_.toInt).toArray

// Dont forget to close the file
source.close

//using nums array after closing the file to demonstrate
println(nums.sum)
}
