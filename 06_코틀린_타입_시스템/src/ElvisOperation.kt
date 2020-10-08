/**
 * 엘비스 연산자는 디폴트 값을 지정할때 유용하게 사용한다.
 * 좌항의 값이 널이라면 디폴트값을 결과로하고, 좌항의 값이 널이아니라면 좌항의 값이 결과가 된다.
 */
fun foo(s: String?) {
    val t: String = s ?: "" // s 가 널이라면 결과는 빈문자열이다.
}

fun strLenSafe(s: String?): Int = s?.length ?: 0

fun main(args: Array<String>) {
    strLenSafe(null)
    strLenSafe("abc")
}