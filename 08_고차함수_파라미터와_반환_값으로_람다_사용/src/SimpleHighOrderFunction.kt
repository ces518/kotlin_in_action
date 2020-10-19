/**
 * 심플한 고차함수 정의
 */
fun twoAndThree(operation: (Int, Int) -> Int) {
    val result = operation(2, 3)
    println("The Result is $result")
}

fun main() {
    twoAndThree { a, b -> a + b}
    twoAndThree { a, b -> a * b}
}