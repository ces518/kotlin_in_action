/**
 * null 이 올수 있는 타입을 넣을 경우 컴파일 에러를 발생시켜 NPE를 방지한다.
 */
fun strLen(s: String) = s.length
fun strLenNullable(s: String?): Int =
        s?.length ?: 0

fun main(args: Array<String>) {
    // null 이 올 수 있는 타입을 넣을 경우 컴파일 에러가 발생한다.
//    strLen(null)

    strLenNullable(null)
}

