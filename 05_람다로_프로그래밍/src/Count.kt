/**
 * Count는 조건을 만족하는 원소의 수를 반환한다.
 */
fun main(args: Array<String>) {
    val canBeInClub27 = { p: SamplePerson -> p.age <= 27}

    val people = listOf(SamplePerson("ncucu", 27), SamplePerson("ncucu.me", 20))
    people.count(canBeInClub27) // 1
}