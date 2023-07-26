import java.io.PrintWriter
import java.io.FileWriter

@main
def main():Unit = {
    val pw = new PrintWriter("file.txt")
    pw.println("The first line.")
    pw.println("The second line.")
    val arr = Array(1,2,3,4,5)
    arr.foreach(i=> pw.println(i))
    pw.close

    // to append to an existing file
    val apw = new PrintWriter(new FileWriter("file.txt",true))
    apw.println("More stuff")
    apw.println("Goes after original contents.")
    apw.close
}
