/**
 * 상속을 허용하기 위해선 open 키워드를 사용해야 한다.
 * 기반 클래스나 인터페이스의 멤버를 오버라이드 하는경우 해당 메소드는 기본적으로 open 이다.
 * 구현을 금지하려면 명시적으로 final 을 붙여 주어야한다.
 */
open class RichButton: Clickable {
    fun disable () {}
    open fun animate () {}
    final override fun click() {}
}