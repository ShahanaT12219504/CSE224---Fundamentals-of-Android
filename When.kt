fun main(){
    val dayofweek = 3
    val dayname = when(dayofweek){
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day"
}
    println("Day of the week: $dayname")
    
}

// When as a statement
fun main(){
    val num = 7
    when{
        num % 2 == 0 -> println("$num is Even")
        num % 2 != 0 -> println("$num is Odd")
        
        else -> println("Unexpected Number")
    }
    
}
