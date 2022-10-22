import kotlin.random.Random
fun main(){
    val computerGuess = (1..3).random()
    println("Enter a guess 1 for rock and 2 for paper and 3 for scissors")
}
fun playGame(){
    val computerGuess = (1..3).random()
    println("Enter a guess 1 for rock 2 and for paper and 3 for scissors")
    val userGuess = readLine()!!.toInt()
    print("The computer entered")
    when(computerGuess){
        1 -> println("The computer entered rock")
        2 -> println("The computer entered paper")
        3 -> println("")
    }
}