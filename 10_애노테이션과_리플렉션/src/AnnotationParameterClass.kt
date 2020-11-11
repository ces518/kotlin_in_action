import kotlin.reflect.KClass

/**
 * 클래스 참조를 파라미터로 하는 애노테이션을 선언하면 클래스를 선언 메타 데이터로 참조할 수 있다.
 * 클래스를 참조타입으로 선언하려면 KClass 라는 타입을 사용해야한다.
 * 이는 자바의 java.lang.Class 와 같은 역할을 하는 코틀린 클래스이다.
 */
annotation class DeserializeInterface(val targetClass: KClass<out Any>)

/**
 * 클래스 참조를 파라미터로 넘기려면 <ClassName>::class 형태로 파라미터를 넘겨주어야 한다.
 */
@DeserializeInterface(String::class)
fun sample() { }