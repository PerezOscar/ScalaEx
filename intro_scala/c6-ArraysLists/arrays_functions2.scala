//set an existing array with a particular value v and an index i
//because it mutates the array this is a side effect and we yield a Unit  
def fillArray(arr:Array[Int],v:Int,i:Int):Unit ={
    //fill an array from low end to the high end
    if (i < arr.length) { //to avoid an out of index error
        arr(i) = v
        //recurse to the next index
        fillArray(arr,v,i+1)
    }
}

def operateOnArray(arr:Array[Int], i:Int, f:(Int,Int)=>Int):Int = {
    if (i<arr.length-1) {
        f(arr(i),operateOnArray(arr,i+1,f))
    } else {
        arr(i)
    }
}

@main
def main():Unit = {
    val nums=Array(1,1,1,1,1,1)
    fillArray(nums,99,0)
    println(nums)
    val nums2=Array(1,2,3,4,5,6)
    println(operateOnArray(nums2,0,_*_))
}
