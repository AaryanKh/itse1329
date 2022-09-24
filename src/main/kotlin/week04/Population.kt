fun main(){
    //Aaryan Khan 04.3 09/23/2022
    println("What is the starting number of organisms >>")
    var startOrganism = readLine()!!.toDouble()
    while(startOrganism < 2){
        println("Please try a number that is 2 or larger")
        startOrganism = readLine()!!.toDouble()
    }

    println("What is their average daily population increase (in %)?")
    var increaseRate = readLine()!!.toDouble()/100
    while (increaseRate < 0){
        println("Please enter a number that is positive ")
        increaseRate = readLine()!!.toDouble()/100
    }

    println("How many days will they multiply?")
    var numberOfDays = Integer.valueOf(readLine())
    while (numberOfDays < 1){
        println("Please enter 1 or more days")
        numberOfDays = Integer.valueOf(readLine())
    }

    for(i in 1 until numberOfDays+1){
        startOrganism *= (increaseRate+1)
        println("After $i day there were $startOrganism organisms")
    }
}