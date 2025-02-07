package Section11

data class User(
    val address: Address?
)

data class Address(
    val city: String?
)

fun getCity(user: User?): String {
    return user?.address?.city ?: "Unknown"

    val user1 = User(Address("Indiana"))
    val user2 = User("123 Jefferson st.")
    val user3 = User(Address("Indianapolis"))

    println(getCity(user1))
    println(getCity(user2))
    println(getCity(user3))
}