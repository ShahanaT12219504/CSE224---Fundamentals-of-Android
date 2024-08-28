// Recursive func
fun factorial(n:Int):Int{
    return if(n <= 1) 1 else n*factorial(n - 1)
  
}

fun main(){
    println("Enter the num to return factorial")
    var y:Int = readln().toInt() //convert the input val to integer
    var x = factorial(y)
    print(x)
}
