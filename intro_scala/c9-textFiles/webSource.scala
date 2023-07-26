import scala.io.Source
import scala.io.StdIn._

@main
def main():Unit = {
    val source = Source.fromURL("http://www.ggle.com")
    println(source.mkString)
}