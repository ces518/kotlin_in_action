fun foo(x: Int) = println(x)

/**
 * 코틀린 리플렉션 API 를 활용한 함수호출 예제
 */
fun main() {
    // ::foo 로 함수참조를 사용해 KFunction 클래스의 인스턴스를 받아온다.
    val kFunction = ::foo

    // KCallable 인터페이스의 call 메소드를 호출해서 해당 함수를 호출한다.
    kFunction.call(1)

    // KFunction 인터페이스의 invoke 메소드는 좀 더 구체적인 정보를 담고 있다.
    kFunction.invoke(1)
}