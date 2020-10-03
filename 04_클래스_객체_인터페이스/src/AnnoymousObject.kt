import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent

/**
 * 무명 객체는 자바의 익명 내부클래스에 대응한다.
 * 객체 선언과 달리 무명 객체는 싱글턴이 아니다.
 */
window.addMouseListener {
    object: MouseAdapter() {
        override fun mouseClicked(e: MouseEvent?) {
            super.mouseClicked(e)
        }

        override fun mouseEntered(e: MouseEvent?) {
            super.mouseEntered(e)
        }
    }
}