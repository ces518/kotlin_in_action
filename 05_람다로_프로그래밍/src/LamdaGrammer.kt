/**
람다 기본 문법

{ x: Int, y: Int -> x + y }
[    파라미터    ] [ 본문 ]

 */

fun main(args: Array<String>) {
    val people = listOf(SamplePerson("ncucu", 27), SamplePerson("ncucu.me", 28))
    // 정식 람다 호출
    people.maxBy({ p: SamplePerson -> p.age })
    // 마지막 인자가 람다인경우
    people.maxBy() { p: SamplePerson -> p.age }
    // 어떤 함수의 유일한 인자이고, 괄호 뒤에 람다를 사용했다면, 호출 시 빈괄호를 제거할 수 있다.
    people.maxBy { p: SamplePerson -> p.age }
    // 로컬 변수처럼 람다 파라미터 타입도 추론이 가능하다.
    people.maxBy { p -> p.age }
    // 람다의 파라미터가 하나 이고, 컴파일러가 타입추론이 가능한경우 it 라고 하는 변수로 접근할 수 있다.
    people.maxBy { it.age }
}