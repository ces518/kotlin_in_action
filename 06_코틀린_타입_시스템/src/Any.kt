/**
 * 자바에서 Object 가 최상위 클래스인것 처럼 코틀린에서는 Any가 최상위 클래스이다.
 * 차이점 이라면 원시타입의 조상도 Any 라는 것이다.
 */
fun main(args: Array<String>) {
    val answer: Any = 42
}