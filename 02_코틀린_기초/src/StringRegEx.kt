/**
 * 코틀린에서는 자바의 split 대신 여러 조합 파라메터를 받는 split 함수를 제공함으로써 혼동을 없앤다.
 */
fun main(args: Array<String>) {
    // 정규식을 전달하는것을 명시적으로 표시
    println("12.345-6.A".split("\\.|-".toRegex()))

    // 여러 구분 문자열을 지정
    println("12.345-6.A".split(".", "-"))
}