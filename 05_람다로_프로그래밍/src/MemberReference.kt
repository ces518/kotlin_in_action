/**
 * 멤버 참조
 */
fun main(args: Array<String>) {
    // 멤버 참조는 아래의 람다식을 심플하게 표현한것이다.
    var getAge = SamplePerson::age
    val getAge2 = { person:SamplePerson -> person.age }

    val people = listOf(SamplePerson("ncucu", 27), SamplePerson("ncucu.me", 27))
    people.maxBy(SamplePerson::age)

    // 최상위에 선언된 함수나 프로퍼티를 참조할 수 있다.
    fun hello() = println("Hello")
    run(::hello)
}