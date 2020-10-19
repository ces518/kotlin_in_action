import java.util.function.Predicate

data class SiteVisit(
    val path: String,
    val duration: Double,
    val os: OS
)

enum class OS { WINDOWS, LINUX, MAC, IOS, ANDROID }

val log = listOf(
    SiteVisit("/", 34.0, OS.WINDOWS),
    SiteVisit("/", 22.0, OS.MAC),
    SiteVisit("/login", 12.0, OS.WINDOWS),
    SiteVisit("/singup", 8.0, OS.IOS),
    SiteVisit("/", 16.3, OS.ANDROID)
)

/**
 * 사이트 방문 데이터 분석 V1
 * 컬렉션 api 를 이용한 보편적인 방법
 */
fun processV1() {
    val average = log
            .filter { it.os == OS.WINDOWS }
            .map(SiteVisit::duration)
            .average()
    println(average)
}

/**
 * 사이트 방문 데이터 분석 V2
 * 확장 함수를 이용해 중복을 제거
 */
fun processV2() {
    fun List<SiteVisit>.averageDurationFor(os: OS) =
            filter { it.os == os }.map(SiteVisit::duration).average()

    println(log.averageDurationFor(OS.WINDOWS))
    println(log.averageDurationFor(OS.MAC))
}

/**
 * 사이트 방문 데이터 분석 V3
 * 고차 함수를 이용한 중복 제거
 * 중복 제거뿐이 아닌 필터 조건이 변경되어도 대응이 가능하다
 */
fun processV3() {
    fun List<SiteVisit>.averageDurationFor(predicate: (SiteVisit) -> Boolean) =
            filter(predicate).map(SiteVisit::duration).average()

    println(log.averageDurationFor { it.os == OS.WINDOWS })
    println(log.averageDurationFor { it.os == OS.MAC })
    println(log.averageDurationFor { it.os in setOf(OS.ANDROID, OS.IOS) })
    println(log.averageDurationFor { it.os == OS.IOS && it.path == "/signup" })
}