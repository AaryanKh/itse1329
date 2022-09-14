fun main(){
    val cookiesPerBag = 40
    val servingsPerBag = 10
    val cookiesPerServing = ((cookiesPerBag/servingsPerBag))
    val caloriesPerServing = 300
    val caloriesPerCookie = (caloriesPerServing/cookiesPerServing)

    println("Enter number of cookies eaten: ")
    val cookies = Integer.valueOf(readLine())
    var calories = caloriesPerCookie*cookies
    println("Your calorie intake was: $calories calories.")
}