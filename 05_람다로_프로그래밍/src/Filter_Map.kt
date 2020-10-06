/**
 * filter 와 map
 */
fun main(args: Array<String>) {
    val list = listOf(1, 2, 3, 4)
    val filteredList = list.filter { it % 2 == 0 } // 짝수만 필터링

    val mapedList = list.map { it * it } // 제곱으로 볁환
}