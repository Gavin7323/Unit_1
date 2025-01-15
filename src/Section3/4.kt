package Section3

fun main() {

    (fun() {
        val arr = arrayOf(1, 2, 3, 4, 5)
        val sum = arr.sum()
        println("The sum of the array is: $sum")
    })()
}
