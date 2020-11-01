/**
 * 반 공변성은 공변 클래스의 반대 경우이다.
 * 반 공변성을 가지는 클래스는 타입 파라미터를 소비하기만 한다.
 * 이를 명시하기위해서는 타입 파라미터 앞에 in 키워드를 사용해야 한다.
 */
interface Comparator<in T> {
    fun compare(e1: T, e2: T): Int
}