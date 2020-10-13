/**
 * plus 와 같은 연산자 오버로딩을 했다면, +=, -= 과 같은 복합 연산자에 대한 오버로딩도 지원한다.
 */
fun main(args: Array<String>) {
    val numbers = ArrayList<Int>()
    numbers += 42
    println(numbers[0])
}