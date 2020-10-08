/**
 * 안전한 캐스트 연산자를 이용한 equals 구현 패턴
 * 보통 안전한 캐스트를 사용할때 뒤에 엘비스 연산자를 사용하는 패턴을 많이 사용한다.
 */
class SafePerson(val firstName: String, val lastName: String) {
    override fun equals(other: Any?): Boolean {
        val otherPerson = other as? SafePerson ?: return false
        return otherPerson.firstName == firstName &&
                other.lastName == lastName
    }
}