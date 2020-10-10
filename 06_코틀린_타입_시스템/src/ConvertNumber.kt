/**
 * 코틀린은 숫자 자동변환을 지원하지 않는다.
 * 직접 변환함수를 호출 해주어야 한다.
 */
fun main(args: Array<String>) {
    // 컴파일 에러, 자동 변환 하지 않음
    val i = 1
//    val l: Long = i

    // 직접 변환 함수를 호출 해주어야 한다.
    val i2 = 1
    val l2: Long = i2.toLong()
}