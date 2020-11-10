/**
 * 코틀린의 @Deprecated 는 자바와 동일한 의미를 가진다.
 * 하지만 ReplaceWith 파라메터를 통해 이전 버전을 대신할 패턴을 제시할 수 있다.
 */
@Deprecated("Use removeAt(index) instead. ", ReplaceWith("remoteAt(index)"))
fun remove(index: Int) { /* ... */ }