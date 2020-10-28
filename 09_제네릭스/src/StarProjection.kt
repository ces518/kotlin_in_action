/**
 * 코틀린에서는 타입 인자를 명시하지 않고 제네릭을 사용할 수 없다.
 * 인자를 알 수 없는 제네릭 타입을 표현할때 스타 프로젝션 (star projection) 을 사용한다.
 * 자바의 List<?> 와 동일하다.
 */
fun main() {
    val list: List<*>? = null
}