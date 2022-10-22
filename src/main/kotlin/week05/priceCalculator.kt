fun main() {
    println("What is an item's wholesale cost?")
    val wholesaleCost = readLine()!!.toDouble()
    println("What is the item's markup percentage?")
    val markupPercentage = readLine()!!.toDouble()
    println("Your final cost is $" + calculateRetail(wholesaleCost,markupPercentage))
}
fun calculateRetail(wholesaleCost: Double,markupPercentage: Double):Double{
    return (wholesaleCost*((markupPercentage/100)+1))
}