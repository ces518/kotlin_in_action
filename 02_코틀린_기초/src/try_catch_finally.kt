import java.io.BufferedReader
import java.lang.NumberFormatException

/**
 * try-catch-finally 는 자바와 동일하다.
 * 코틀린은 체크예외와 언체크 예외를 구분하지 않는다.
 * 또한 try-with-resource 구문은 지원하지않는데, 이는 라이브러리 함수로 같은 기능을 구현한다.
 */
fun readNumber(reader: BufferedReader): Int? {
    try {
        val line = reader.readLine()
        return Integer.parseInt(line)
    } catch (e: NumberFormatException) {
        return null
    } finally {
        reader.close()
    }
}

/**
 * try 를 식으로 사용하기
 * try는 if 와 when 과 마찬가지로 식이다.
 * if 와는 달리 try는 본문을 반드시 중괄호로 둘러 써야한다.
 */
fun readNumberV2(reader: BufferedReader) {
    val number = try {
        Integer.parseInt(reader.readLine())
    } catch (e: NumberFormatException) {
        return
    }
    println(number)
}