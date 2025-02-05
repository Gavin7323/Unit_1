package section10

fun <T> pipe(vararg functions: (T) -> T): (T) -> T {
    return { input: T ->
        functions.fold(input) { acc, fn -> fn(acc) }
    }
}

val increment: (Int) -> Int = { x -> x + 1 }
val doubleValue: (Int) -> Int = { x -> x * 2 }
val squareValue: (Int) -> Int = { x -> x * x }
val halveValue: (Int) -> Int = { x -> x / 2 }

val processNumber = pipe(increment, doubleValue, squareValue, halveValue)

println(processNumber(3)) // Output: 16
