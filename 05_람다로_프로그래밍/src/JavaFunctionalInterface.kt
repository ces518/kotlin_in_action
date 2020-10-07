/**
 * 함수형 인터페이스를 인자로 받는 자바 메소드에 코틀린 람다를 전달할 수 있음.
 */
fun main(args: Array<String>) {
    // 람다를 사용.
    val t = Thread { println("hello") }
    t.start()

    // 무명객체를 명시적으로 선언
    val t2 = Thread(object : Runnable {
        override fun run() {
            println("hello")
        }
    })
    t2.start()
}