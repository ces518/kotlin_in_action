import java.lang.StringBuilder

/**
 * 컬렉션의 toString() 을 커스터마이징 할 수 있는 함수
 * 하지만 가독성 부분에서 좋지가 않다.
 */
fun <T> joinToString(
        collection: Collection<T>,
        separator: String,
        prefix: String,
        postfix: String
) : String {
    val result = StringBuilder(prefix)
    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}


/**
 * 코틀린에서는 함수에 전달하는 인자에 이름을 명시할 수 있다.
 * 유의점은 하나라도 명시했다면 혼동을 막기 위해 그 뒤에 오는 인자는 모두 이름을 명시해야한다.
 */
fun main(args: Array<String>) {
    val list = listOf(1, 2, 3)
    // IDE 의 도움을 받을 수 있지만, 가독성 이 좋지않다.
    joinToString(list, "; ", "(", ")")

    // 코틀린에서는 위 문제를 다음과 같이 해결한다.
    joinToString(list, separator = " ", prefix = " ", postfix = ".")
}

/**
 * 자바에서 오버로딩한 메소드가 많아진다는 문제를 코틀린에서는 디폴트 파라메터값을 통해 해결했다.
 * 함수의 디폴트 파라메터 값은 호출하는 쪽이 아닌 선언 쪽에서 지정된다는 점에 유의하라.
 */

// 자바에서 좀 더 편하게 코틀린 함수를 호출하고 싶다면 @JvmOverloads 애노테이션을 사용하라.
// 코틀린 컴파일러가 자동으로 오버로드한 메소드들을 추가해준다.
@JvmOverloads
fun <T> joinToStringWithDefaultParameter(
        collection: Collection<T>,
        separator: String = ", ",
        prefix: String = "",
        postfix: String = ""
) : String {
    val result = StringBuilder(prefix)
    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

fun main2() {
    val list = listOf(1, 2, 3)
    joinToStringWithDefaultParameter(list, "", "", "")

    joinToStringWithDefaultParameter(list, separator = ":")
}