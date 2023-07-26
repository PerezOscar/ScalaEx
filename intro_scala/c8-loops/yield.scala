// act as expression by adding the word yield and avoid doing side effects
// for example:
// for (i <- 1 to 10 ) yield i*i
// >> res1: scala.collection.immutable.IndexedSeq[Int] = Vector(1,2,3,4,5,6,7,8,9,10)



def evalPolyYield(coeffs:Array[Double],x:Double):Double ={
    (for (i<- coeffs.indices) yield {
        coeffs(i)*math.pow(x,coeffs.length-1-i)
    }).sum
}

@main
def main():Unit = {
    println(evalPolyYield(Array(3,2,-5),1))
}
