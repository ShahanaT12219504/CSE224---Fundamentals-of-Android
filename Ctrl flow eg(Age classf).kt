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
