fun main(){
    //Aaryan Khan 04.2 09/23/2022
    println("Enter a String >> ")
    val userString = readLine()!!
    println("Enter a character >>")
    val userCharacter = readLine()!!.single()
    var characterCount = 0
    for(i in 0 until userString.length ){
        if(userCharacter == userString.get(i)){
            characterCount += 1
        }
    }
    print("The number of times your character has appeared is $characterCount")
}