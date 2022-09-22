import com.sun.jdi.IntegerValue

fun main() {
    // Aaryan Khan 03.8 Bank Charges
    println("How many checks did you write this month?")
    val numberOfChecks = Integer.valueOf(readLine()!!)
    val baseFee = 10
    var feePerCheck: Double = 0.0

    if (numberOfChecks < 20) {
        feePerCheck = .10
    }
    if (numberOfChecks >= 20 && numberOfChecks <= 39) {
        feePerCheck = .08
    }
    if (numberOfChecks >= 40 && numberOfChecks <= 59) {
        feePerCheck = .06
    }
    if(numberOfChecks >= 60){
        feePerCheck = .04
    }
    val serviceFees = ((feePerCheck*numberOfChecks)+baseFee)
    println("The service fees for the month are $$serviceFees")
}