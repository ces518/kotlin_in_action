data class SamplePerson(val name: String, val age: Int)

/**
 * 가장 연장자를 찾는 함수
 * 이는 코드가 장황하고 실수를 저지르기 쉽다.
 */
fun findTheOldest(people: List<SamplePerson>) {
    var maxAge = 0
    var theOldest: SamplePerson? = null
    for (person in people) {
        if (person.age > maxAge) {
            maxAge = person.age
            theOldest = person
        }
    }
    println(theOldest)
}

/**
 * 람다를 사용해 해결
 */
fun main(args: Array<String>) {
    val people = listOf(SamplePerson("ncucu", 27), SamplePerson("ncucu.me", 28))
    println(people.maxBy { it.age })

    // 멤버 참조를 사용해 해결
    println(people.maxBy(SamplePerson::age))
}