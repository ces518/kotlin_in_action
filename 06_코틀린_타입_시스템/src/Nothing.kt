import java.lang.IllegalStateException

/**
 * 정상적으로 끝나지 않는 함수의 경우 (테스트 프레임워크의 fail등..)
 * Nothing 반환 타입을 명시해 줌으로써 정상적으로 끝나지 않음을 표시해주면 유용하다.
 */
fun fail(message: String): Nothing {
    throw IllegalStateException(message)
}