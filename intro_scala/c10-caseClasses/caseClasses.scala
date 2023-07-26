/*                                                                                                                                            
scala> :load c10-caseClasses/caseClasses.scala
// defined case class Point3D
// defined case class Student
                                                                                        
scala> Point3D(1,2,3)
val res4: Point3D = Point3D(1.0,2.0,3.0)
                                                                                        
scala> Student("Mark", List(90,88), List(100,95), List(96,84,72))
val res5: Student = Student(Mark,List(90, 88),List(100, 95),List(96, 84, 72))
                                                                                        
scala> 
*/


//case classes are inmutables as long as things inside them
import io.StdIn._

case class Point3D(x:Double, y:Double, z:Double)
case class Student(name:String, tests:List[Int], assns:List[Int],quizzes:List[Int])

def distance(p1:Point3D,p2:Point3D):Double = {
    val dx = p1.x-p2.x
    val dy = p1.y-p2.y
    val dz = p1.z-p2.z
    math.sqrt(dx*dx + dy*dy + dz*dz)
}

def classAverage(s:Student):Double = {
    0.4*s.tests.sum/s.tests.length + 0.5*s.assns.sum/s.assns.length + 0.1*s.quizzes.sum/s.quizzes.length
}

/*
scala> :load c10-caseClasses/caseClasses.scala
// defined case class Point3D
// defined case class Student
def distance(p1: Point3D, p2: Point3D): Double

scala> distance(Point3D(1,2,3),Point3D(4,5,6))
val res7: Double = 5.196152422706632

scala> :load caseClasses.scala
// defined case class Point3D
// defined case class Student
def distance(p1: Point3D, p2: Point3D): Double
def classAverage(s: Student): Double

scala> val stu = Student("Mark",List(90,88), List(100,95), List(96,84,72))
val stu: Student = Student(Mark,List(90, 88),List(100, 95),List(96, 84, 72))

scala> classAverage(stu)
val res0: Double = 92.75

scala> 
*/