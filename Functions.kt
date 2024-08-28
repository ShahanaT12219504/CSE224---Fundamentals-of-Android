// User defined func
fun demo() {
        print("Hello")
    }
    fun main(args: Array<String>){
        demo()//func call
        print(" Mofo")
   
    }

    // Func based on type of arg
    // Default arguments
fun sum(a:Int = 10,b:Int = 20) {
    val c = a+b
    println(c)
}
fun main(){ //1st executed
    sum(20,50)
    sum()
}

// Without Default arguments
fun sum(a:Int,b:Int) {
    val c = a+b
    println(c)
}
fun main(){
    sum(20,50)
    sum() //No value passed for parameter error
}


// returning values from func
fun main(args: Array<String>){
    val a = 10
    val b = 20
    val result = sum(a,b)
    println(result)
}
fun sum(a:Int,b:Int):Int{
    val x = a + b
    return x //only returns the val nd it is assigned to result in main func
}


// create a func to convert temperature from celsius to farenheit and vice versa
fun main(args: Array<String>){
    val C = 25
    val F = 80
    val celsiusToFarenheit = CtoF(C)
    val farenheitToCelsius = FtoC(F)
    println("Celsius to Farenheit: $celsiusToFarenheit°F")
    println("Farenheit to Celsius: $farenheitToCelsius°C")
}
fun CtoF(celsius:Int):Int{
    val farenheit =  (celsius * 9/5) + 32
    return farenheit 
}

fun FtoC(farenheit:Int):Int{
    val celsius =  (farenheit - 32) * 5/9
    return celsius 
}
