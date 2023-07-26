
def evalQuad(x:Double, a:Double=0,b:Double=0, c:Double=0):Double = {
    a*x*x + b*x +c
}

/*
scala> :load evalPoly.scala
def evalQuad(a: Double, b: Double, c: Double, x: Double): Double
                                                                                        
scala> evalQuad(1,0,0,2)
val res0: Double = 4.0

scala> evalQuad(x=2,a=1,b=0,c=0)
val res1: Double = 4.0
                                                                                                                                                 
scala> evalQuad(1,0,x=2,c=0)
val res2: Double = 4.0
                                                                                        
scala>                                                                       
scala> 
*/