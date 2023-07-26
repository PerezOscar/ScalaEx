def sum3(x:Double, y:Double, z:Double):Double = x+y+z
def mult3(x:Double, y:Double, z:Double):Double = x*y*z
def min3(x:Double, y:Double, z:Double):Double = x min y min z
def combine3(x:Double, y:Double, z:Double, f:(Double,Double)=>Double):Double = f(f(x,y),z)

@main
def main():Unit = {
    //lambda function
    println(combine3(1,4,6,(x,y)=>x+y))
    // the lambda function can also be _f_ using wildcards
    println(combine3(1,4,6,_ - _))
    // the lambda function can also be _f_ using wildcards
    println(combine3(1,4,6,_ min _))
    // the lambda function can also be _f_ using wildcards
    println(combine3(1,4,6,_ max _))
}
