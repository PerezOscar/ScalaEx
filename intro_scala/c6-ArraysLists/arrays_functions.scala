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

@main
def main():Unit = {
    val nums=Array(1,1,1,1,1,1)
    fillArray(nums,99,0)
    println(nums)
}