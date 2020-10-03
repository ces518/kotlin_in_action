/**
 * 동반객체에 이름을 지정할경우 해당 이름을 사용하여 호출, 혹은 기존방식대로 호출이 가능하다.
 */
class SimplePerson(val name: String) {
    companion object Loader {
        fun fromName(name: String): SimplePerson = SimplePerson(name)
    }
}

fun main(args: Array<String>) {
    SimplePerson.fromName("Hello")
    SimplePerson.Loader.fromName("Hello2")
}