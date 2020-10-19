/**
 * 3장에서 살펴보았던 예제의 일부를 채용
 * 함수를 파라미터로 선언할 경우 다른 파라미터와 동일하게 디폴트값 설정이 가능하다.
 */
fun <T> Collection<T>.joinToString(
        transform: (T) -> String = { it.toString() }
) : String {
    /* .. */
    val result = StringBuilder()
    for ((index, element) in this.withIndex()) {
        if (index > 0) result.append(element)
        result.append(transform(element))
    }
    return result.toString()
}

/**
 * 함수 파라미터가 nullable 하다면, 다른 변수들과 동일하게 안전한 호출을 사용할 수 있다.
 * 아래 예제는 안전한 호출과 엘비스 연산자를 활용한 예이다.
 */
fun <T> Collection<T>.joinToStringWithNullableFunction(
        transform: ((T) -> String)? = null
) : String {
    /* .. */
    val result = StringBuilder()
    for ((index, element) in this.withIndex()) {
        if (index > 0) result.append(element)
        result.append(
                transform?.invoke(element) ?: element.toString()
        )
    }
    return result.toString()
}