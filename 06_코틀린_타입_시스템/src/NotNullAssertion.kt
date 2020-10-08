/**
 * NotNullAssertion 은 nullable한 타입의 값을 nullable 하지 않게 강제로 바꾼다.
 * 코틀린 개발자들은 컴파일러가 검증할 수 없는 단언을 사용하기 보다 더 나은 방법을 찾아보라는 의드로
 * !! 라는 기호로 표현하였다.
 */
fun ignoreNulls(s: String?) {
    val sNotNull: String = s!!
    println(sNotNull.length)
}