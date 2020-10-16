/**
 * by lazy() 를 사용하면 위임 프로퍼티 객체를 반환한다.
 * 지연 초기화를 사용할 수 있다.
 */
class LazyPerson(val name: String) {
    val emails by lazy { loadEmails(this) }
}

fun loadEmails(person: LazyPerson) : List<String> {
    println("${person.name} 의 메일 로딩")
    return listOf(/* .. */)
}