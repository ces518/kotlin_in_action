/**
 * 정규식을 사용한 경로 파싱
 */
fun parsePathUseRegEx(path: String) {
    val regex = """(.+)/(.+)\.(.+)""".toRegex()
    val matchResult = regex.matchEntire(path)
    if (matchResult != null) {
        val (directory, filename, extension) = matchResult.destructured
        println("Dir: $directory, name: $filename, ext: $extension")
    }
}

fun main(args: Array<String>) {
    parsePathUseRegEx("/Users/yole/kotlin-book/chapter.adoc")
}