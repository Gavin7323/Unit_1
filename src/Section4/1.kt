data class Book(
    val title: String,
    val author: String,
    val genre: String
) {
    fun getSummary(): String {
        return "\"$title\" by $author, Genre: $genre."
    }
}

fun main() {
    val book = Book("percy Jackson", "Rick Riordan", "Fantasy")
    println(book.getSummary())
}
