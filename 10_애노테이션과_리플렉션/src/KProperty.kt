/**
 * KProperty 를 이용하면 프로퍼티를 참조할 수 있다.
 * KFunction 과 마찬가지로 call 메소드를 사용할 수 있지만, set, get 과 같은 더 안전한 방법을 제공한다.
 */
var counter = 0

fun main() {
    val kProperty = ::counter

    kProperty.setter.call(1)
    kProperty.set(1)

    kProperty.getter.call()
    kProperty.get()

    // 동적으로 Person 의 age를 가져오는 예제
    val person = Person("ncucu", 27)
    val memberProperty = Person::age
    println(memberProperty.get(person))
}