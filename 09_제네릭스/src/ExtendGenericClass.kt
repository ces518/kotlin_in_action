/**
 * 제네릭 클래스를 확장하는 경우, 구체적인 타입 인자를 넘겨주거나, 확장 클래스의 타입 인자를 사용할 수 있다.
 */
class StringList: GenericList<String> {
    override fun get(index: Int): String { return "1" }
}