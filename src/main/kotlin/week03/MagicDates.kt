fun main(){
    print("Enter a two-digit month: ")
    var month = Integer.valueOf(readLine())
    print("Enter a two-digit day: ")
    var day = Integer.valueOf(readLine())
    print("Enter a two-digit year:")
    var year = Integer.valueOf(readLine())

    println("You entered $month/$day/$year.")

    if(month*day == year){
        println("Your date is a magic number!")
    }
    else{
        print("Your date is not a magic number!")
    }
}