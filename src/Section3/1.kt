package Section3

fun main() {
    val number = 5

    val squaredNumber = square(number)

    println("The square of $number is: $squaredNumber")
}

fun square(number: Int): Int {
    return number * number
}
