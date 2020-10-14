/**
 * Comparable 인터페이스의 CompareTo 함수를 구현하면 비교 연산 관례를 사용할 수 있다.
 * compareValuesBy 는 코틀린 표준 라이브러리 존재하는 CompareTo 함수를 심플하게 구현할수 있는 함수이다.
 */
class Person (
        val firstName: String,
        val lastName: String
): Comparable<Person> {
    override fun compareTo(other: Person): Int {
        return compareValuesBy(this, other,
                Person::lastName, Person::firstName)
    }
}

fun main(args: Array<String>) {
    val p1 = Person("a", "b")
    val p2 = Person("c", "d")
    println(p1 < p2)
}