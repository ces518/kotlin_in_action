/**
 * Null Safe 연산자를 사용하면 좀 더 간결하게 표현할 수 있다.
 */
fun printAllCaps(s: String?) {
    val allCaps: String? = s?.toUpperCase()
    println(allCaps)
}

fun main(args: Array<String>) {
    printAllCaps("abc")
    printAllCaps(null)
}