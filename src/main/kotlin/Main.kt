import kotlin.time.times

fun main() {
 printFullName("yvonne","martin" )
    getStringLength("airfreshner")
    add(24,87)
    add(75,84)
    add(-673,89)
    add(488353757,8483743)
    printFullName("yvonne","martin")
    var X = division(10.0,2)
    println(X)
    var y = add(90,800)
    println(y)
    var z = diameter(3.142,20)
    println(z)


}
    fun printFullName(firstName:String,lastName:String){
        var fullName = firstName +" "+ lastName
        println(fullName)
    }

fun getStringLength(word:String){
    println(word.length)
}
fun add(num1 : Int, num2 : Int):Int{
   return num1 + num2

}
fun division (num1: Double,num2: Int):Double{
  return num1/num2


}
fun diameter (num1:Double, num2: Int):Double{
    return num1*num2/2
}
