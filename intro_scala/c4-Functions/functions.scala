//This will convert a string with time to total seconds

/* 
A function can help us breaking problems down. 
Break a problem down into easy problems
*/

import io.StdIn._

def breakDownTime(time:String):(Int,Int,Int) = {
    val firstColon = time.indexOf(":")
    val secondColon = time.lastIndexOf(":")
    val hours = time.substring(1,firstColon).toInt
    val minutes = time.substring(firstColon+1,secondColon).toInt
    val seconds = time.substring(secondColon+1).toInt
    (hours,minutes,seconds)
}

def calctotalSeconds(hours:Int, minutes:Int, seconds:Int):Int = {
    hours*3600 + minutes*60 + seconds
}

@main
def execute(): Unit = {
    println("Enter a time with colons between the values")
    val time = readLine
    val (hours,minutes,seconds) = breakDownTime(time)
    val totalSeconds = calctotalSeconds(hours,minutes,seconds)
    println(totalSeconds)
}
