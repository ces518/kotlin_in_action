/**
 * 문자열 템플릿은 자바의 문자열 접합 연산 ("Hello," + name + "!") 와 동일한 기능이지만, 좀 더 간결하다.
 * 단순히 변수명으로만 한정되지 않으며, 복잡한 식은 중괄호 ( { } ) 를 사용하여 문자열 템플릿에 사용할 수 있다.
 */
fun main (args: Array<String>) {
    val name = if (args.size > 0) args[0] else "Kotlin"
    println("Hello, $name")
    // println("Hello, ${args[0]}")
}