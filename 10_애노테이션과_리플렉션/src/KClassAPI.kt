import kotlin.reflect.full.memberProperties

data class Person(
        val name: String,
        val age: Int
)

/**
 * KClass API 는 java.lang.Class 와 동일한 역할을 한다.
 * Person::class 라는 식을 사용하면 KClass 인스턴스를 얻을수 있다.
 * 실행 시점에 객체의 클래스를 얻으려면, 객체의 kClass 프로퍼티를 사용해, 자바클래스를 얻어야 하는데 이는 java.lang.Object.getClass() 와 동일하다.
 * 자바클래스를 얻어 .kotlin 확장 프로퍼티를 통해 코틀린 리플렉션 API 로 변환할 수 있다.
 */
fun main() {
    val person = Person("ncucu", 27)
    val kClass = person.javaClass.kotlin
    println(kClass.simpleName)
    kClass.memberProperties.forEach { println(it.name) }
}