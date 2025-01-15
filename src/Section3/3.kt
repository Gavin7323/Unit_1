package Section3

fun main() {
    val counter = createCounter()

    println(counter()) // Output: 5
    println(counter()) // Output: 6
    println(counter()) // Output: 7
    println(counter()) // Output: 8
}

fun createCounter(): () -> Int {
    var count = 5
    return {
        count++
        count - 1
    }
}
