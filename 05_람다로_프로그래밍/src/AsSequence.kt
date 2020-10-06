/**
 * asSequence 를 이용한 지연 연산을 사용하면 컬렉션 매 연산마다 중간 컬렉션이 생성되지 않는다.
 */
fun main(args: Array<String>) {
    val people = listOf(SamplePerson("ncucu", 27), SamplePerson("ncucume", 27))
    // 아래 코드는 연쇄 호출이 2개의 리스트를 만든다.(map의 결과, filter의 결과)
    people.map(SamplePerson::name).filter { it.startsWith("A") }

    // 아래 코드는 1개의 리스트만을 만든다.
    people.asSequence()
            .map(SamplePerson::name)
            .filter { it.startsWith("A") }
            .toList()
}