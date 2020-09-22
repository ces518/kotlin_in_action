/**
 * enum 은 자바선언보다 코틀린 선언에 키워드가 더 많은 흔치 않은 예 이다.
 * 코틀린 에서의 enum 은 소프트 키워드 라 불린다.
 * enum 은 class 앞에 존재할 때만 특별한 의미를 가지지만 다른 곳에서는 이름에 사용이 가능하다.
 *
 * 코틀린 enum 에서는 enum 목록과 메서드 정의 사이에 세미콜론을 넣어 구분한다.
 * 코틀린에서 유일하게 세미콜론을 사용하는 부분이다.
 */
enum class Color {
    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET
}

enum class ColorWithPropertyAndMethod (
    val r: Int,
    val g: Int,
    val b: Int
) {
    RED(255, 0, 0),
    ORANGE(255, 165, 0),
    YELLOW(255, 255, 0);

    fun rgb() = (r * 256 + g) * 256 + b
}