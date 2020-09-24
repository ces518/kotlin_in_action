/**
 * 확장 함수를 만들때는 추가하려는 함 수앞에 그 함수가 확장할 클래스 명을 덧붙여야 한다.
 * 사용할때는 확장된 클래스의 함수를 호출하듯이 사용하면 된다.
 */
fun String.lastChar() : Char = this.get(this.length -1)

fun main(args: Array<String>) {
    println("Hello".lastChar())
}