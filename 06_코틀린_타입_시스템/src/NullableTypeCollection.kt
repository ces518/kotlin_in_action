import java.io.BufferedReader
import java.lang.NumberFormatException

/**
 * 널이 될수 있게 만들때는 주의 해야한다
 * List<Int?> 는 내부 요소가 널이 될 수 있고
 * List<Int>? 는 리스트 전체가 널이 될 수 있다.
 */
fun readNumbers(reader: BufferedReader): List<Int?> {
    val result = ArrayList<Int?>()
    // BufferedReader 를 코틀린에서 다루는 베스트한 방법
    for (line in reader.lineSequence()) {
//        try {
//            val number = line.toInt()
//            result.add(number)
//        } catch (e: NumberFormatException) {
//            result.add(null)
//        }
        // 코틀린 1.1 이후
        val number = line.toIntOrNull()
        result.add(number)
    }
    return result
}

/**
 * 널이 될 수 있는 값으로 이뤄진 컬렉션 다루기
 */
fun addValidNumbers(numbers: List<Int?>) {
    var sumOfValidNumbers = 0
    var invalidNumbers = 0
    for (number in numbers) {
        if (number != null) {
            sumOfValidNumbers += number
        } else {
            invalidNumbers ++
        }
    }
    println("Sum of valid numbers: $sumOfValidNumbers")
    println("Invalid numbers: $invalidNumbers")
}

fun addValidNumbersV2(numbers: List<Int?>) {
    // 코틀린 표준 라이브러리에 존재하는 널값 걸러내기
    // 널이 없음을 보장해주기 때문에 validNumbers 는 List<Int> 타입이다.
    val validNumbers = numbers.filterNotNull()
    println("Sum of valid numbers: ${validNumbers.sum()}")
    println("Invalid numbers: ${numbers.size - validNumbers.size}")
}