/**
 * 람다를 인자로 받는 buildString() 함수 정의
 */
fun buildString(
        builderAction: (StringBuilder) -> Unit
): String {
    val sb = StringBuilder()
    builderAction(sb)
    return sb.toString()
}

fun main() {
    val s = buildString {
        it.append(1)
        it.append(2)
    }
    // ...
}