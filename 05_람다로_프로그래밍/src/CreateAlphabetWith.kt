/**
 * with는 수신객체를 지정한 람다이다.
 * 첫번째 인자로 받은 객체를 두번째 인자로 받은 람다의 수신객체로 만든다.
 */
fun alphabet(): String {
    val result = StringBuilder()
    for (letter in 'A'..'Z') {
        result.append(letter)
    }
    result.append("\n Now I Know the alphabet!")
    return result.toString()
}

fun alphabetWith(): String {
    val stringBuilder = StringBuilder()

    return with(stringBuilder) {
        for (letter in 'A'..'Z') {
            append(letter)
        }
        append("\n Now I Know the alphabet!")
        return toString()
    }
}

fun alphabetWithRefactoring(): String = with(StringBuilder()) {
    for (letter in 'A'..'Z') {
        append(letter) // this.append() 로 스트링빌더 객체를 호출한다. this는 생략할 수 있다.
    }
    append("\n Now I Know the alphabet!")
    toString()
}

fun main(args: Array<String>) {
    println(alphabet())
    println(alphabetWith())
    println(alphabetWithRefactoring())
}