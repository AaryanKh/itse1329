fun main(){
    //Aaryan Khan 04.1 09/23/2022
    println("Please enter a positive non zero value >> ")
    val userInput = Integer.valueOf(readLine())
    var totalNumber = 0
    for(i in 1 until  userInput+1){
        totalNumber += i
    }
    println("The sum of numbers from 1 to $userInput is >> ")
    println(totalNumber)
}