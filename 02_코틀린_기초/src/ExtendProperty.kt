import java.lang.StringBuilder

/**
 * 확장 프로퍼티는 상태를 가질 수 없다.
 *
 */
val String.lastChar: Char
    get() = get(length - 1)

var StringBuilder.lastChar: Char
    get() = get(length - 1)
    set(value: Char) {
        this.setCharAt(length - 1, value)
    }