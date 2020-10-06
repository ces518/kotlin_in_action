/**
 * group by는 어떤 특정 조건에 맞게 그룹을 나눌때 사용한다.
 * 반환값은 LinkedMap이다.
 */
fun main(args: Array<String>) {
    val people = listOf(SamplePerson("A", 27), SamplePerson("B", 20), SamplePerson("C", 20))
    val groupBy = people.groupBy { it.age }
    println(groupBy) // {27=[SamplePerson(name=A, age=27)], 20=[SamplePerson(name=B, age=20), SamplePerson(name=C, age=20)]}
}