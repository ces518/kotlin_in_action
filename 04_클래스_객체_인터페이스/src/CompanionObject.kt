/**
 * 클래스 내부에 정의된 객체 중 하나에 companion 키워드를 사용하면 해당 객체는 동반 객체가 된다.
 * 동반객체를 사용할떄는 동반객체를 가지고 있는 클래스를 사용하듯이 사용하면된다.
 * 동반객체는 오직 하나만 지정될 수 있다.
 */
class A {
    companion object {
        fun bar() {
            println("Companion Object called")
        }
    }
}

fun main(args: Array<String>) {
    A.bar()
    // Companion Object called
}