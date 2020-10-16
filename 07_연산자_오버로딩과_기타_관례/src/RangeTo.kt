import java.time.LocalDate

/**
 * RangeTo 함수를 구현하고 있다면, .. 을 통해 범위 생성 관례를 사용할 수 있다.
 * 만약 Comparable 인터페이스를 구현하고 있다면, RangeTo 함수를 구현하지 않아도 된다.
 */
fun main(args: Array<String>) {
    val now = LocalDate.now()
    val vacation = now..now.plusDays(10)
    println(vacation)
}