/**
 * 맵을 이터레이션 할 때 구조분해 문법은 매우 유용하다.
 */
fun printEntries(map: Map<String, String>) {
    for ((key, value) in map) {
        println("$key -> $value")
    }
}

fun main(args: Array<String>) {
    val map = mapOf("Oracle" to "java", "JetBrains" to "Kotlin")
    printEntries(map)
}