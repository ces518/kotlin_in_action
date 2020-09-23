import java.lang.IllegalArgumentException

/**
 * 코틀린의 기본 예외처리 구문은  자바와 비슷하다.
 * 차이점 이라면 throw 도 식이기 때문에 다른 식에 포함될 수 있다.
 */
fun main(args: Array<String>) {
    val percentage: Int = 50

    if (percentage !in 0..100) {
        throw IllegalArgumentException("A percentage value must be between 0 and 100: $percentage")
    }
}