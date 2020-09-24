/**
 * 맵을 생성할 때 to 는 중위 호출을 한 예이다.
* 중위 호출을 가능하게 하려면, 함수 선언 앞에 infix 변경자를 선언해야 한다.
*/
infix fun Any.to(other: Any) = Pair(this, other)

fun main(args: Array<String>) {
    // number, name 을 1 to "one" 의 결과로 초기화 한다. 이런 방식을 구조분해선언 이라고 한다.
    val (number, name) = 1 to "one"
}