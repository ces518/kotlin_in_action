/**
 * 람다식에 레이블을 붙이려면 람다를 여는 블록 {} 앞에다가 넣으면 레이블을 붙일 수 있다.
 * return문 뒤에 레이블을 사용하면 로컬 return이 된다.
 */
fun main() {
    val strings = listOf("A", "B", "C")
    strings.forEach label@{
        if (it == "C") return@label
        println("hello")
    }
    println("ddd")
}