import java.lang.StringBuilder

/**
 * With 와 거의 동일하며 항상 자신에게 전달된 객체를 반환한다는 점이 다르다.
 */
fun alphabetApply() = StringBuilder().apply {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\n Now I Knopw the alphabet!")
}.toString()

fun main(args: Array<String>) {
    println(alphabetApply())
}