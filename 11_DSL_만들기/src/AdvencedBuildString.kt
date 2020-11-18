/**
 * 수신객체 지정 람다를 이용해 편리성을 높힘
 */
fun buildStringV2(
        builderAction: StringBuilder.() -> Unit
): String {
    val sb = StringBuilder()
    sb.builderAction()
    return sb.toString()
}

fun main() {
    buildStringV2 {
        append(2)
        append(3)
    }
}