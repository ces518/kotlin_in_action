/**
 * 제네릭 함수를 호출 할때 구체적인 타입 파라미터를 넘겨주어야 한다.
 * 하지만 대부분의 경우 컴파일러가 타입 파라미터를 추론할 수 있기 때문에 생략이 가능하다.
 */
fun main() {
    val letters = ('a'..'z').toList()
    println(letters.slice<Char>(0..2))
    println(letters.slice(0..2))
}