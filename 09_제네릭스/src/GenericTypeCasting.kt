import java.lang.IllegalArgumentException

fun printSum(c: Collection<*>) {
    val intList = c as? List<Int>
            ?: throw IllegalArgumentException("List is expected")
    println(intList.sum())
}

fun main() {
    printSum(listOf(1, 2, 3))

    // List 기저 타입이 아니기 때문에, IllegalArgumentException 발생
    printSum(setOf(1, 2, 3))

    // List 기저 타입이기 때문에 캐스팅에는 성공하지만, sum() 함수 호출시 ClassCastException 이 발생한다.
    printSum(listOf("a", "b", "c"))
}