import java.util.Scanner
import java.io.File

def main():Unit = {
    // scanner would read from a file the same way it could read 
    // a String chain and break apart that string for you
    // In this case scanner will read from a file
    val sc = new Scanner(new File("fileNums.txt"))
    // the first line will read it as a word next as an integer 
    // and the third as a double
    val (word, i, x) = (sc.next, sc.nextInt, sc.nextDouble)
}