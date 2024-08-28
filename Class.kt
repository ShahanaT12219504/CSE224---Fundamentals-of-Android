class ABC{
    var message = "Hello"
    
    fun display() 
{ 
    
    println(message)
}

}

fun main(){
    val msg=ABC()
    msg.display()
}


class Student{
    fun result(){
        println("Pending")
    }
}
fun main(){
    val s1 = Student()
    s1.result()
}
