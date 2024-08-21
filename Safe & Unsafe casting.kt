fun main() {
    val a = "Hi"
    val b: String = a as String
    println("This is unsafe casting: $b")
    
    val c :Int? = a as? Int
    println("$c")
    
    val d :Int = a as Int
    println("$d")
}
