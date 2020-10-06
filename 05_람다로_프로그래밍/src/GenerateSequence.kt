/**
 * generateSequence 를 사용하면 이전의 원소를 인자로 받아 다음 원소를 계산한다.
 */
fun main(args: Array<String>) {
    val naturalNumbers = generateSequence(0) {  it + 1 }
    val numbersTo100 = naturalNumbers.takeWhile { it <= 100 }
    println(numbersTo100.sum()) // 결과는 5050
}