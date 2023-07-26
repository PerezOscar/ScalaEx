/* IF GUARDS
for (i <- 1 to 10) yield i*i
for (i <- 1 to 10) yield { if (i%2==0)i*i }
for (i <- 1 to 10; if i%2==0) yield i*i
for {
    i <- 1 to 10
    if i%2==0
    } yield i*i
*/






/* MULTIPLE GENERATORS
for (i <- 1 to 10; j <- 1 to 10) println(i+" "+j)
for (i <- 1 to 10; j <- 1 to 10) yield (i,j)
for (i <- 1 to 10; j <- 1 to 10) yield (i,j,i*j)
for (i <- 1 to 10; j <- i to 10) yield (i,j)

grid of points
for (x <- -1.0 to 1.0 by 0.1; y <- -1.0 to 1.0 by 0.1) yield (x,y)
*/







/* PATTERNS IN FOR LOOPS
List[(1,2),(3,4),(1,7),(6,5),(0,3),(1,9)]
val tuples=List[(1,2),(3,4),(1,7),(6,5),(0,3),(1,9)]
for( (n1,n2) <- tuples) println(n1+" "+n2)

for ((1,n2 <- tuples)) yield n2
>> res8: List[Int] = List(2,7,9)

val h::t = tuples
>> h: (Int,Int) = (1,2)
>> t: List(Int,Int) = List((3,4),(1,7),(6,5),(0,3),(1,9))

scala> val tuples = List((1,2),(3,4),(1,7),(6,5),(0,3),(1,9))
val tuples: List[(Int, Int)] = List((1,2), (3,4), (1,7), (6,5), (0,3), (1,9))
                                                                                
scala> val List(t1,t2,t3,t4,t5,t6) = tuples
val t1: (Int, Int) = (1,2)
val t2: (Int, Int) = (3,4)
val t3: (Int, Int) = (1,7)
val t4: (Int, Int) = (6,5)
val t5: (Int, Int) = (0,3)
val t6: (Int, Int) = (1,9)
*/








/* VARIABLE DECLARATIONS

val grid = for {
    x <- -1.0 to 1.0 by 0.1; y <- -1.0 to 1.0 by 0.1
 } yield (x,y)
val inRange = for{
    (x,y) <- grid; mag = math.sqrt(x*x+y*y)
    if mag>0.5 && mag<1.0
}  yield (x,y,mag) 


@main
def main():Unit = {
    println(inRange)
}
*/






/* FOR COMPREHENSION

scala> for (i<- 1 to 10) println(i)
1
2
...                                                                                

scala> (1 to 10).foreach(i => println(i))
1
2
...

scala> for (i<- 1 to 10) yield i*i
val res0: IndexedSeq[Int] = Vector(1, 4, 9, 16, 25, 36, 49, 64, 81, 100)
                                                                                
scala> (1 to 10).map(i=> i*i)
val res1: IndexedSeq[Int] = Vector(1, 4, 9, 16, 25, 36, 49, 64, 81, 100)
for 
*/






/* MULTIDIMENSIONAL FOR LOOPS
we have to nest loops using yield

for (i <- 1 to 10) yield {
    for (j <- 1 to 10 ) yield i*j
}

*/


/* PARALLEL FOR LOOPS
this is an advance topic 
multi threading

for(i <- (1 to 10).par)
var i = 0 // avoid working with vars using par

*/