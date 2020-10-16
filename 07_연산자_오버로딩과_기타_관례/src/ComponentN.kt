/**
 * data 클래스의 주 생성자에 들어있는 프로퍼티는 컴파일러가 자동으로 만들어 준다.
 * componentN 함수는 구조분해 관례로 사용한다.
 */
class ComponentPoint(val x: Int, val y: Int) {
    operator fun component1() = x
    operator fun component2() = y
}

fun main(args: Array<String>) {
    val point = ComponentPoint(1, 2)
    val (x, y) = point
    println(x)
}