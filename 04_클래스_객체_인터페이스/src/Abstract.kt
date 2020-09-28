/**
 * 추상 클래스는 기본적으로 open 이기 떄문에 명시할 필요가 없다.
 * 비 추상함수는 기본적으로 파이널 이지만 원한다면 open 으로 오버라이드 할 수 있다.
 */
abstract class Animated {
    abstract fun animate()

    open fun stopAnimating() {

    }

    fun animateTwice() {

    }
}