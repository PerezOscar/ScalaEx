/*
for (i <- 0 to 9) println(i)
    //0 to 9 
    //0 until 10 
    //0.to(9)
    // >> scala.collection.immutable.Range = Range(0,1,2,3,4,5,6,7,8,9)

val lst = List(6,9,2,7,4,8,1,3)
for (i<-lst) println(i)
*/


//3*x^2+2*x-5
//Array(3,2,-5)
def evalPoly(coeffs:Array[Double],x:Double):Double ={
    var sum =0.0
    //for i<- 0 to coeffs.length)
    for (i<- coeffs.indices) {
        sum+= coeffs(i)*math.pow(x,coeffs.length-1-i)
    }
    sum
}

def evalPolyRev(coeffs:Array[Double],x:Double):Double ={
    var sum = 0.0
    var power = 1.0
    //for i<- 0 to coeffs.length)
    for (c <- coeffs.reverse) {
        sum += c*power
        power *= x
    }
    sum
}

def evalPolyStep(coeffs:Array[Double],x:Double):Double ={
    var sum = 0.0
    var power = 1.0
    for (i <- coeffs.length-1 to 0 by -1) {
        sum += coeffs(i)*power
        power *= x
    }
    sum
}

def evalPolyYield(coeffs:Array[Double],x:Double):Double ={
    (for (i<- coeffs.indices) yield {
        coeffs(i)*math.pow(x,coeffs.length-1-i)
    }).sum
}

@main
def main():Unit = {
    println(evalPoly(Array(3,2,-5),1))
    println(evalPolyRev(Array(3,2,-5),1))
    println(evalPolyStep(Array(3,2,-5),1))
    println(evalPolyYield(Array(3,2,-5),1))
}
