/**
 * 자바의 인터페이스와 유사하다.
 * 구현을 가지는 메소드가 존재할 수 있다.
 * 인터페이스 선언시 interface 키워드를 사용한다.
 * override 변경자는 자바의 @Override 애노테이션과 비슷하다.
 * 하지만 자바와 달리 반드시 사용해야한다.
 */
interface Clickable {
    fun click()
    fun showOff() = println("I'm clickable!")
}

class Button: Clickable {
    override fun click() = println("I was Clicked")
}

fun main(args: Array<String>) {
    Button().click()
}


/**
 * 이름과 시그니쳐가 동일한 메소드에 대해 둘 이상의 디폴트 구현이 있는경우
 * 인터페이스 구현체인 클래스에서 명시적으로 새로운 구현을 제공해야한다.
 *
 * super<Type> 을 지정하면 특정 상위타입의 멤버 메소드를 호출할 수 있다.
 */
interface Focusable {
    fun setFocus(b: Boolean) =
            println("I ${if (b) "got" else "lost"} focus.")
    fun showOff() = println("I'm focusable!")
}

class Button2: Clickable, Focusable {
    override fun click() = println("I was clicked")

    override fun showOff() {
        super<Clickable>.showOff()
        super<Focusable>.showOff()
    }
}