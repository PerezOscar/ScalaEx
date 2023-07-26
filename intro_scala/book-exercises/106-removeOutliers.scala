import io.StdIn._

def removeOutliers(data:List[Int],num_outliers:Int):List[Int] = {
    var retval = data.sorted

    for (i <- 1 to num_outliers)
        retval = retval.init

    for (i <- 1 to num_outliers)
        retval = retval.tail

    retval
}

@main 
def main():Unit = {
    println(removeOutliers(List(12,23,32,4,35),1))
}