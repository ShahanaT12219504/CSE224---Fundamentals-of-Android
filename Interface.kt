interface Shape{
    fun area():Double
}
open class Rectangle(val a:Double,val b:Double):Shape{
    override fun area():Double{
        return a * b
    }

    open fun display(){
        println("Area of rectangle with dimensions $a * $b is ${area()}")
    }
}
class Square(side:Double):Rectangle(side,side){
    override fun display() {
        println("Area of square with side $a is ${area()}") //it is inheriting the props of rectangle class(which is open), so need of adding open for square class
    }
}

fun main(){
    val myRectangle = Rectangle(4.0,5.0) //this is an object
    myRectangle.display()
    val mySquare = Square(3.0) //this is an object
    mySquare.display()
}
