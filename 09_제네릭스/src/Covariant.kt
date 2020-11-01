/**
 * 코틀린에서 타입 파라미터에 공변적임을 선언하려면 out 키워드를 사용해야 한다.
 * 다음 선언은 T 에 대해 공변적임을 알려준다.
 */
interface Producer<out T> {
    fun produce(): T
}
