/**
 * 널 가능성이 있는 타입의 두 값을 직접 비교할 수는 없다.
 * 널 검사를 마친 뒤 일반 값처럼 다루게 허용된다.
 */
data class HelloPerson(val name: String,
                       val age: Int? = null) {
    fun isOlderThan(other: HelloPerson): Boolean? {
        if (age == null || other.age == null) {
            return null
        }
        return age > other.age
    }
}