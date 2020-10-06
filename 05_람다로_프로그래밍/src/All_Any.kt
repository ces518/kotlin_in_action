/**
 * all 은 모든 원소가 해당 조건을 만족하는지 판단하고
 * any는 해당 조건을 만족하는 원소가 하나라도 있는지 판단한다.
 */
fun main(args: Array<String>) {
    val canBeInClub27 = { p: SamplePerson -> p.age <= 27}

    val people = listOf(SamplePerson("ncucu", 27), SamplePerson("ncucu.me", 20))
    people.all(canBeInClub27) // false

    people.any(canBeInClub27) // true
}