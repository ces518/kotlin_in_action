/**
 * 구조 분해를 사용하면 객체의 값을 분해해서 여러 다른 변수로 한꺼번에 초기화할 수 있다.
 */
fun main(args: Array<String>) {
    val p = Point(10, 20)
    val (x, y) = p
    println(x)
}