fun printContents(list: List<Any>) {
    println(list.joinToString())
}

fun addAnswer(list: MutableList<Any>) {
    list.add(42)
}

fun main() {
    // 다음과 같은 경우에는 제네릭 타입 인자가 String 인 List를 넘겨도 문제가 없다.
    printContents(listOf("abc", "bac"))

    val strings = mutableListOf("abc", "bac")
    // 컴파일러가 TypeMismatch 에러를 발생시키며 막아주고 있지만
    // 만약 컴파일에 성공한다면 그 다음줄인 strings.maxBy 에서 예외가 발생할 것이다.
//    addAnswer(strings)
    println(strings.maxBy { it.length })
}