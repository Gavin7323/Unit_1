fun main() {
    // Example number to square
    val number = 5

    // Call the square function and store the result
    val squaredNumber = square(number)

    // Output the result
    println("The square of $number is: $squaredNumber")
}

// Function to square a number
fun square(number: Int): Int {
    return number * number
}
