/**
 * 코틀린에서 타입 파라미터는 널이 될 수 있는 타입이다.
 * 타입 뒤에 ? 가 없더라도 널이 될 수 있는 타입이라는 점을 기억하라.
 */
fun <T> printHashCode(t: T) {
    println(t?.hashCode())
}

/**
 * 타입 파라미터가 널이 아님을 확실히 하려면 널이 될 수 없는 타입 상한을 지정해야한다.
 */
fun <T: Any> printHashCodeNotNull(t: T) {
    println(t.hashCode())
}

fun main(args: Array<String>) {
    printHashCode(null)
    printHashCodeNotNull('A')
}