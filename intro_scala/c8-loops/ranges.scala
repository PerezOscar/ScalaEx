// 1 to 9
// 1 until 10
// Array(1,2,3,4,5,6,7,8,9).indices
// 'a' to 'z'
// 1L to 10L (rage of longs from 1 to 10)
// 1.0 to 2.0 
// 1.0 to 2.0 by 0.1
// 10 to 1 by -1 (count backwards)
// 1 to 10 by 2
// 100 to 1 by -7

def evalPoly(coeffs:Array[Double],x:Double):Double ={
    var sum =0.0
    //for i<- 0 to coeffs.length)
    for (i<- coeffs.indices) {
        sum+= coeffs(i)*math.pow(x,coeffs.length-1-i)
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

@main
def main():Unit = {
    println(evalPoly(Array(3,2,-5),1))
    println(evalPolyStep(Array(3,2,-5),1))
}
