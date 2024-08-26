fun main() {
    val grade = 85
    if(grade >= 90){
        println("Grade A")
    }
    else if(grade >= 80){
        println("Grade B")
    }
    else if(grade >= 70){
        println("Grade C")
    }
    else{
        println("Grade D")
    }
    
   
}

// construct calc using if,else, else if for all arithmetic operators
fun main(){
    val a = 50
    val b = 40
    val op = "*" 
    if(op == "+"){
        println("Sum of $a + $b = ${a + b}")
        
    }
    else if(op == "-"){
        println("Difference of $a - $b = ${a - b}")
        
    }
    else if(op == "*"){
        println("Product of $a * $b = ${a * b}")
        
    }
    else if(op == "/"){
        if(b != 0){
            println("Division of $a / $b = ${a / b}")
        }
        else{
            println("Error, not divisible by 0")
        }  
    }
  
}

// Age classification
fun main(){
    val age = 65
    
    if(age < 13){
        println("Child")
        
    }
    else if(age in 13..19){
        println("Teenager")
        
    }
    else if(age in 20..64){
        println("Adult")
        
    }
    else{
            println("Senior")
        }  

}
