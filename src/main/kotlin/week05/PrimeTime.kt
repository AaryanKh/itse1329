fun main(){
    println(isPrime(6))
    println(isPrime(13))
    println(isPrime(8893))
}
fun isNumberDivisible(number: Int, divisor: Int): Boolean{
    return number % divisor == 0
}
fun isPrime(number: Int): Boolean {
    if (number <= 0)
        return false
    for (i in 2 until number) {
            if (isNumberDivisible(number, i)){
                return false
            }
        }
    return true
}
