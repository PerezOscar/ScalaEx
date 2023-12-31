
//check args on scala 3
import scala.io.Source
import java.io.PrintWriter

@main
def main():Unit = {
    if (args.length<2) {
        println("Usage requires two arguments: a filename and a name to thin to.")
    } else {
        val source = Source.fromFile(args(0))
        val lines = source.getLines
        val matches = lines.filter(line => line.split(",")(3)==args(1))
        val pw = new PrintWriter(args(1)+".txt")
        matches.foreach(line => pw.println(line))
        pw.close
        source.close
    }
}
