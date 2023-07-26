scala> :load caseClasses.scala
// defined case class Point3D
// defined case class Student
def distance(p1: Point3D, p2: Point3D): Double
def classAverage(s: Student): Double
                                                                                        
scala> val p = Point3D(1,2,3)
val p: Point3D = Point3D(1.0,2.0,3.0)
                                                                                        
scala> Point3D(1+p.x,p.y,p.z)
val res0: Point3D = Point3D(2.0,2.0,3.0)
                                                                                        
scala> p.copy(x=p.x+1)
val res1: Point3D = Point3D(2.0,2.0,3.0)
                                                                                        
scala> val s = Student("Mark",Nil,Nil,Nil)
val s: Student = Student(Mark,List(),List(),List())
                                                                                        
scala> s.copy(tests = 99::s.tests)
val res2: Student = Student(Mark,List(99),List(),List())
                                                                                        
scala> res2.copy(assns = 90::s.assns)
val res3: Student = Student(Mark,List(99),List(90),List())
                                                                                        
scala> 