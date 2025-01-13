fun main() {
    // Create a counter starting from 5
    val counter = createCounter()

    // Call the counter function multiple times
    println(counter()) // Output: 5
    println(counter()) // Output: 6
    println(counter()) // Output: 7
    println(counter()) // Output: 8
}

// Function that creates a counter starting from 5
fun createCounter(): () -> Int {
    var count = 5
    return {
        count++
        count - 1 // Return the current count before incrementing
    }
}
