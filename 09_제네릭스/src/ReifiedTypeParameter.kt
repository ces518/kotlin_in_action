/**
 * 함수를 inline 으로 선언하면, 타입 파라미터는 실행 시점에 사라지지 않는다.
 * 이를 코틀린에서는 실체화 된다고 표현한다.
 * inline 함수의 타입 파라미터에 reified 키워드를 사용하여, 실체화될 파라미터라고 알려준다.
 */
inline fun <reified T> isA(value: Any) = value is T

fun main() {
    println(isA<String>("abc"))
    println(isA<String>(123))
}