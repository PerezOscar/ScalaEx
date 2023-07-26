/* Determine whether or not a string entered by the user is a 
 palindrome using recursion

 Determine whether or not a string is a palindrome 
 @param s the string to check
 @return True if the string is a palindrome, False otherwise
*/
import io.StdIn._

def isPalindrome(s:String):Boolean = {
    if (s.length <= 1) {
        true
    } else {
        (s(0)==s(s.length-1) && isPalindrome(s.substring(1,s.length-1)))
    }
}

@main
def main():Unit = {
    val line = readLine
    if (isPalindrome(line)) {
        println("That was a palindrome!")
    } else {
        println("That is not a palindrome.")
    }
}
