import kotlin.reflect.full.findAnnotation

annotation class MyAnnotation

@MyAnnotation
class Hi()

fun main() {
    val hi = Hi()

    val kClass = hi.javaClass.kotlin
    // annotations 프로퍼티는 @Retention RUNTIME 으로 지정된 애노테이션 인스턴스의 컬렉션이다.
    val annotations = kClass.annotations

    // 특정 애노테이션만 찾고 싶다면 findAnnotation 함수를 사용
    val myAnnotation = kClass.findAnnotation<MyAnnotation>()
    println(myAnnotation)
}