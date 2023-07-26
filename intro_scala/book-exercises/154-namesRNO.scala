/*  Display all girls and boys names in IL and TX states that were the most 
    popular in at least one year between 1910 and 2012. */

import scala.io.Source

val firstYear = 1900
val lastYear = 2012

/* Load the first line from the line from the file
    extract the name, and add it to the names list if it is not already present
    @param the name of the file to read the data from
    @param the list to add the name to (if itsnt already present)
    @return (None) */


def loadAndAdd(fname:String):Array[(String,Int,String,Int)] = {
    val source = Source.fromFile(fname)
    val lines = source.getLines
    var namesArr =  Array[(String,Int,String,Int)]()
    var dataNames = lines.filter {
        line=>//line.split(",")(1)=="F" &&
        line.split(",")(2).toInt >= firstYear && 
        line.split(",")(2).toInt <= lastYear
    }

    for (line <- dataNames) {
        var cols = line.split(",").map(_.trim)
        namesArr=namesArr:+(cols(1),cols(2).toInt,cols(3),cols(4).toInt)
    }
    namesArr
}


def maxByGender(data:Array[(String,Int,String,Int)]):(String,String) = {
    val (x,y)= data.partition(_._1=="F")
    (x.maxBy(_._4)._3 , y.maxBy(_._4)._3)
}


@main
def main(): Unit= {
    var load=loadAndAdd("namesbystate/STATE.TX.TXT")
    println(maxByGender(load))
}
