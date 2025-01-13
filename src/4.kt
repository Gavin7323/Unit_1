fun main() {
    // IIFE-like function in Kotlin to calculate the sum of an array
    (fun() {
        val arr = arrayOf(1, 2, 3, 4, 5)
        val sum = arr.sum()
        println("The sum of the array is: $sum")
    })() // Immediately invoking the function
}
