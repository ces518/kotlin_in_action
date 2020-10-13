/**
 * 코틀린에서 plus 라는 이름의 메소드를 정의하면 해당 인스턴스에 대해 + 연산자를 이용가능하다.
 * 이 때 반드시 operator 키워드를 붙어주어야 한다.
 */

data class Point(val x: Int, val y: Int) {
    operator fun plus(other: Point): Point {
        return Point(x + other.x, y + other.y)
    }
}

fun main(args: Array<String>) {
    val p1 = Point(10, 20)
    val p2 = Point(30, 40)
    println(p1 + p2)
}