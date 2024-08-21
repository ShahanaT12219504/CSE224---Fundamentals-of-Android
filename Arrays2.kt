fun main() {
    //     Array of Ingtegers
    val nums = arrayOf(1,2,3,4)
    println(nums.contentToString())

//     Array of Strings
    val words: Array<String> = arrayOf("Human", "Being")
    println(words.contentToString())

//     Array of Squares using lambda for conditions
    val squares = Array(5) {i -> i * i}
    println(squares.contentToString())
  //     Retrieve the values of an array
    val firstNumber = nums[0]
    val secondWord = words[1]
    println("First number: $firstNumber")
    println("Second word: $secondWord")

//    Modifying elements
    nums[0] = 10
    words[1] = "Kotlin"
    println("Modified 1st num: ${nums.joinToString()}")
    println("Modified 2nd word: ${words.joinToString()}")

//    Using For loop
    println("Nums array using for loop")
    for(num in nums){
        println(num)
    }
    
//     Multidimensional array
//     2D
   val matrix: Array<Array<Int>> = arrayOf(arrayOf(1,2,3),arrayOf(3,4,5));
   println("Element at row 0, column 1: ${matrix[0][1]}")

// 3D
   val array3D = arrayOf(
        arrayOf(
            intArrayOf(1, 2, 3),
            intArrayOf(4, 5, 6),
            intArrayOf(7, 8, 9)
        ),
        arrayOf(
            intArrayOf(10, 11, 12),
            intArrayOf(13, 14, 15),
            intArrayOf(16, 17, 18)
        )
    )

    // Printing the whole array
    for (matrix2D in array3D) {
        for (row in matrix2D) {
            for (element in row) {
                print("$element ")
            }
            println()
        }
        println()
    }

}
