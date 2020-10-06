/**
 * find 는 조건을 만족하는 첫번째 원소를 반환한다.
 */
fun main(args: Array<String>) {
    val canBeInClub27 = { p: SamplePerson -> p.age <= 27}

    val people = listOf(SamplePerson("ncucu", 27), SamplePerson("ncucu.me", 20))
    people.find(canBeInClub27) // name = ncucu, age = 27
}