/**
 * 동반 객체에 대해 확장 함수 정의도 가능하다.
 */
class SimpleA {
    companion object {

    }
}

fun SimpleA.Companion.hello() = println("Hello")

fun main(args: Array<String>) {
    SimpleA.hello()
}