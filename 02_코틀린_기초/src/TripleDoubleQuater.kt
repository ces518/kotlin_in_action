/**
 * 3중 따옴표 문자열을 이용한 ascii art
 */
fun main(args: Array<String>) {
    val kotlinLogo = """|  //
                       .| //
                       .|/ \""".trimMargin(".")
    println(kotlinLogo)
}