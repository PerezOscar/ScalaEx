import scala.io.Source
import scala.io.StdIn._
import java.io._

@main
def main():Unit = {
    try {
        val source = Source.fromFile("fiveNums.txt")
        try {
            val lines = source.getLines
            val nums = lines.filter(_.nonEmpty).map(_.toInt).toArray
        } catch {
            case e:NumberFormatException => println("The file contained a non-number.")
        } finally {
            source.close
        }
    } catch {
        case ex:FileNotFoundException => println("File doesnt exist.")
    }
}
