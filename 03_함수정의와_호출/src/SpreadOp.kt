/**
 * 자바에서는 배열을 가변길이 인자로 넘길때 배열을 그대로 넘기면 되지만, 코틀린에서는 스프레드 연산자를 사용해야한다.
 * 단지 배열 앞에 *를 붙이기만 하면 된다.
 */
fun main(args: Array<String>) {
    val list = listOf("args", *args)
    println(list)
}