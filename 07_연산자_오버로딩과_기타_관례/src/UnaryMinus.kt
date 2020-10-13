/**
 * 단항 연산자를 오버로딩하는 경우도 이항 연산자와 동일하다.
 */
operator fun Point.unaryMinus(): Point {
    return Point(-x, -y)
}

fun main(args: Array<String>) {
    val p = Point(10, 20)
    println(-p)
}