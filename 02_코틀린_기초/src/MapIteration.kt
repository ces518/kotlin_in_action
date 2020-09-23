import java.util.*

/**
 * for 루프를 사용해 이터레이션 하려는 컬렉션의 원소를 풀어서 letter, binary 두 변수로 사용한다.
 * 또한 맵을 사용할때 get, put 을 사용하는 대신 map[key], map[key] = value 형태로 사용할 수 있다.
 * 구조분해 구문은 맵이 아닌 컬렉션에도 사용할 수 있다.
 */
fun main(args: Array<String>) {
    val binaryReps = TreeMap<Char, String>()

    for (c in 'A'..'F') {
        val binary = Integer.toBinaryString(c.toInt())
        binaryReps[c] = binary // == binaryReps.put(c, binary) 와 동일하다.
    }

    // 구조분해 구문
    for ((letter, binary) in binaryReps) {
        println("$letter = $binary")
    }

    // 현재 원도의 인덱스를 유지하며 이터레이션
    val list = arrayListOf("10", "11", "1001")
    for ((index, element) in list.withIndex()) {
        println("$index: $element")
    }
}