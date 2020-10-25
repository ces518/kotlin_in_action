/**
 * value는 널이 될 수 있기 대문에 안전한 호출을 사용해야 한다.
 */
class Process<T> {
    fun process(value: T) {
        value?.hashCode()
    }
}

/**
 * 항상 널이 될 수 없는 타입 파라미터 제약을 걸려면 상한에 Any 를 지정해야 한다.
 */
class ProcessNotNull<T : Any> {
    fun process(value: T) {
        value.hashCode()
    }
}