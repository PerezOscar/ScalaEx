// this intends to read from a file using
//scala redirect.scala < fiveNums.txt to execute

import io.StdIn._

@main
def main():Unit = {
    val nums = Array.fill(5)(readInt)
    println(nums.sum.toDouble/nums.length)
}

