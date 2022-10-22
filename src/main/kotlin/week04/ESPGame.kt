fun main() {
    //Aaryan Khan 04.6 9/23/2022
    val colorList = listOf("Red","Green","Blue","Orange","Yellow")
    var correctCount = 0
    for(i in 1 until 10){
        val randomNumber = (Math.random()*5).toInt()
        val computerGuess = colorList[randomNumber]
        println("Enter a guess")
        val playerGuess = readLine()!!
        println("The color was $computerGuess")
        if(playerGuess.equals(computerGuess, ignoreCase = true)){
             correctCount += 1
        }
    }
    println("The user correctly guessed the color $correctCount number of times.")
}