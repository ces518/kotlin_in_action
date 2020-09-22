/**
 * 코틀린 프로퍼티를 정의할 때는 변수 선언과 마찬가지로 val 혹은 var 키워드를 사용한다.
 * val 키워드를 사용하면, 읽기 전용 프로퍼티가 생성되며, 비공개 필드와 getter 를 생성한다.
 * var 키워드를 사용하면 쓰기 가능한 프로퍼티로, 비공개 필드, getter, setter 를 생성한다.
 */
class Person(
    val name: String,
    var isMarried: Boolean
)

/**
 * 코틀린 에서는 프로퍼티를 직접 사용한다.
 * 프로퍼티를 직접호출하더라도 자동적으로 getter, setter 를 호출해준다.
 * 자바에서 작성된 프로퍼티도 동일하게 사용할 수 있다.
 */
fun useProperty() {
    val person = Person("엔꾸꾸", false)
    person.name
    person.isMarried
    person.isMarried = true
}

/**
 * 코틀린 에서는 커스텀 프로퍼티 기능을 제공한다.
 * 자체 구현을 제공하는 게터만 존재하는 프로퍼티이다.
 * 값을 저장하는 필드가 없고, 프로퍼티에 접근할 때 마다 getter 가 매번 다시 계산한다.
 */
class Rectangle(val height: Int, val width: Int) {
//    val isSquare: Boolean
//        get() {
//            return height == width
//        }
    val isSquare: Boolean
          get() = height == width
}