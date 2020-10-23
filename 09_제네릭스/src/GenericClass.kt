/**
 * 코틀린에서도 제네릭 클래스를 선언할 수 있다.
 */
interface GenericList<T> {
    operator fun get(index: Int): T
}