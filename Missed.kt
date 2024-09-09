fun main() {
    
   //total amount and membership status
    
    var tot_amount=2000
    var ms="no"

    //eligible for discount?
   
    
    if(tot_amount>=1000)
    {
        if(ms=="yes"){
            println("You get 20% discount!")
            
        }
        else if(ms=="no"){
            println("You get 10% discount!")
        }
        
    }
    else if(tot_amount<1000)
    {
        println("You are not eligible for a discount.")
    }
    else{
        println("Incomplete Details")
    }
    
}
