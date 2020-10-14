import java.lang.IndexOutOfBoundsException

/**
 * p[index] 형태에서 대괄호를 인덱스 연산자라고 한다.
 * 인덱스 연산자는 get, set 을 구현하면 관례를 적용할 수 있다.
 *
 */
data class MutablePoint(var x: Int, var y: Int);

operator fun MutablePoint.get(index: Int): Int =
    when (index) {
        0 -> x
        1 -> y
        else ->
            throw IndexOutOfBoundsException("Invalid coordinate $index")
    }

operator fun MutablePoint.set(index: Int, value: Int) =
    when (index) {
        0 -> x = value
        1 -> y = value
        else ->
            throw IndexOutOfBoundsException("Invalid coordinate $index")
    }

fun main(args: Array<String>) {
    val p1 = MutablePoint(0, 1)
    println(p1[0]) // 0 으로 접근하면 x 를
    println(p1[1]) // 1로 접근하면 y 를 반환한다.

    p1[0] = 10
    p1[1] = 20

    println(p1)
}