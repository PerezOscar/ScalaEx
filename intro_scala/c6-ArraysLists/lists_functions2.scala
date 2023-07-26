import io.StdIn._
//lists are unmutable
def inputList(n:Int):List[Int] = {
    if (n<1) Nil else readInt::inputList(n-1)
}

def operateOnList(lst:List[Int],base:Int,f:(Int,Int)=>Int):Int = {
    if(lst==Nil) base else f(lst.head,operateOnList(lst.tail,base,f))
}

def operateOnList2(lst:List[Int],base:Int,f:(Int,Int)=>Int):Int = lst match {
    case Nil => base
    case h::t => f(h,operateOnList(t,base,f))
}

@main
def main():Unit ={
    val lst= inputList(5)
    println(lst)
    println(operateOnList2(lst,0,_ + _))
}