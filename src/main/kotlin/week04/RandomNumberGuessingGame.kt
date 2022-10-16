fun main() {
    //Aaryan Khan 04.5 9/23/2022
    val randomNumber = (Math.random()*20).toInt()
    println("Enter a guess")
    var playerNumber = Integer.valueOf(readLine())
    while (playerNumber != randomNumber){
        if(playerNumber > randomNumber){
            println("Too high, try again")
            playerNumber = Integer.valueOf(readLine())
        }
        else{
            println("Too low, try again")
            playerNumber = Integer.valueOf(readLine())
        }
    }
    println("Congrats you guessed the right number!")
}