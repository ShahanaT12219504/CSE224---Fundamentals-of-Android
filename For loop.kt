// Both ends of range inclusive
fun main(){
    for (j in 1..5){
        println("Number:$j")
    }
}


fun main(){
    for (i in 1 until 5){
        println("Number:$i")
    }

}


// Reverse Loop
// downTo --> Reverse
fun main(args: Array<String>){
    for (item_ in 5 downTo 1){
        println(item_)
    }
}


fun main(args: Array<String>){
//Reverse with step size
    for (item in 5 downTo 1 step 2){
        println(item)
    }

}

// when only statements need to be accessed
fun main() {
    val fruits = listOf("Apple", "Banana", "Cherry")
    for (index in fruits.indices) {
        println("Fruit $index: ${fruits[index]}")
    }
}
