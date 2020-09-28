import java.io.Serializable

/**
 * 코틀린의 중첩 클래스에 아무런 변경자가 없다면, 자바의 static 중첩클래스와 동일하다.
 * 내부 클래스로 변경해서 바깥쪽 클래스에 대한 참조를 포함하고 싶다면 inner 변경자를 붙여야 한다.
 * 내부 클래스에서 바깥 클래스에 참조하려면 this@<외부클래스명> 형태로 사용해야한다.
 */
interface State: Serializable
interface View {
    fun getCurrentState(): State
    fun restoreState(state: State) {}
}

class Button: View {
    override fun getCurrentState(): State = ButtonState()
    override fun restoreState(state: State) {

    }

    class ButtonState: State {

    }
}

class Outer{
    inner class Inner {
        fun getOuterReference(): Outer = this@Outer
    }
}