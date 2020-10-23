/**
 * 제네릭 함수와 마찬가지로 제네릭 확장 프로퍼티도 정의가 가능하다.
 * 아래 함수는 리스트의 마지막 원소 바로 앞에 있는 원소를 반환하는 확장 함수이다.
 */
val <T> List<T>.penultimate: T
    get() = this[size - 2]

fun main() {
    println(listOf(1, 2, 3, 4).penultimate)
}