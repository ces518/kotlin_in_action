import java.time.LocalDate

/**
 * 날짜 범위에 대한 이터레이터 구현
 */
operator fun ClosedRange<LocalDate>.iterator(): Iterator<LocalDate> =
        object: Iterator<LocalDate> {
            var current = start

            override fun next() = current.apply { current = plusDays(1) }

            override fun hasNext() =  current <= endInclusive

        }


fun main(args: Array<String>) {
    val newYear = LocalDate.ofYearDay(2017, 1)
    val daysOff = newYear.minusDays(1)..newYear
    for (dayOff in daysOff) { println(dayOff) }
}