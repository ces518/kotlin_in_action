/**
 * SAM 생성자 사용
 * 함수형 인터페이스의 인스턴스를 반환하는 메소드가 있다면
 * 람다를 직접 반환할 수 없고, 반환하고 싶은 람다를 SAM 생성자로 감싸야 한다.
 */
fun createAllDoneRunnable(): Runnable {
    return Runnable { println("All done!") }
}

fun main(args: Array<String>) {
    createAllDoneRunnable().run()
}