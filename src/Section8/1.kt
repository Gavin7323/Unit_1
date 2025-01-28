package Section8

fun main() {
    try {
        validateUsername("Person15")

        validateUsername("us")
    } catch (e: ValidationError) {
        println("Error: ${e.message}")
    }
}

fun validateUsername(username: String) {
    if (username.length < 5) {
        throw ValidationError("Username must be at least 5 characters long.")
    }
    if (!username.matches(Regex("^[a-zA-Z0-9_]*$"))) {
        throw ValidationError("Username can only contain letters, numbers, and underscores.")
    }
    println("Username is valid!")
}

class ValidationError(message: String) : Exception(message)
