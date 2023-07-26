//fill method set same values to all entries
def fillarr():Unit = {
    println(Array.fill(10)(2))
}

//tabulate method set values by index
def tabulate():Unit = {
    println(Array.tabulate(10)(i=>i+1))
    println(List.tabulate(10)(_*2))
}

@main
def main():Unit = {
    println(fillarr())
    println(tabulate())
}
