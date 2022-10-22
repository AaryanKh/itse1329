import kotlin.math.pow
// Aaryan Khan 02.9 CompoundInterest 09/15/2022
fun main(){
    println("What was the principal amount deposited into the account? ")
    val principal = Integer.valueOf(readLine())
    println("What is the annual interest percent rate paid by the account? ")
    val interestRate = Integer.valueOf(readLine())
    val doubleRate = interestRate.toDouble()
    println("How many times per year is the interest compounded?")
    val compoundPerYear = Integer.valueOf(readLine())
    println("How many years have you had this bank account for?")
    val numberOfYears = Integer.valueOf(readLine())

    val base = ((principal*(1+((doubleRate/100)/compoundPerYear))))
    val exponent = compoundPerYear*numberOfYears
    val amount = base.pow(exponent)
    println("The final amount is $amount")
}
