class ClazzUser(val name: String) {
    var address: String = "unspecified"
        set(value: String) {
            print("""
                Address was change for $name:
                "$field" -> "$value".""".trimIndent()) // 뒷받침하는 필드 읽기
            field = value // 뒷받침하는 필드 변경
        }
}

fun main(args: Array<String>) {
    val user = ClazzUser("Ncucu")
    user.address = "Suwon"
    // Address was change for Ncucu:
    // "unspecified" -> "Suwon".
}