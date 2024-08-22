fun main() {
    var a = 10
    var b = 5
    var c = 8
    var d = 12
    var e = 9
    
//     Arithmetic
    val sum = a+b
    val prod = a*b
    val diff = a-b
    println("Sum of $a + $b = $sum")
    println("Product of $a * $b = $prod")
    println("Difference of $a - $b = $diff")
    println("Division of $a / $b = ${a/b}")
    println("Remainder of $a % $b = ${a%b}")
    
//     Relational
    println("\n$a > $b = ${a>b}")
    println("$a < $b = ${a<b}")
    println("$a >= $b = ${a>=b}")
    println("$a <= $b = ${a<=b}")
    println("$a == $b = ${a==b}")
    println("$a != $b = ${a!=b}")
    
//     Assignment
    a += b
    println("\n$a")
    b -= c 
    println("$b")
    c *= d
    println("$c")
    d /= e
    println("$d")
    e %= a
    println("$e")
    
//    Unary
   val isTrue = true
   println("Unary plus of $a = ${+a}")
   println("Unary minus of $b = ${-b}")
   println("Increment of $a = ${++a}")
   println("Decrement of $b = ${--b}")
   println("${!isTrue}")
    
   
}
