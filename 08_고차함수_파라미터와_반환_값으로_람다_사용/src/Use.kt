import java.io.BufferedReader
import java.io.FileReader

/**
 * 코틀린 에서는 언어적인 차원에서 자바의 try-with-resource 구문을 지원하지 않는대신
 * use 라는 함수를 이용해서 동일한 기능을 지원한다.
 */
fun readFirstLineFromFile(path: String): String =
    BufferedReader(FileReader(path)).use { it.readLine() }