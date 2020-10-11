/**
 * Kotlin Collection 의 특징은 읽기전용과, 읽기/쓰기용 인터페이스를 분리 했다는 점이다.
 * Collection 은 읽기전용, MutableCollection 은 쓰기가 가능한 컬렉션이다.
 * 어떤 함수의 MutableCollection 인터페이스 인자를 보고 변경이 일어날수 있음을 짐작할 수 있다.
 */
fun <T> copyElements(source: Collection<T>,
                     target: MutableCollection<T>) {
    for (item in source) {
        target.add(item)
    }
}

fun main(args: Array<String>) {
    val source: Collection<Int> = arrayListOf(3, 5, 7)
    val target: MutableCollection<Int> = arrayListOf(1)
    copyElements(source, target)
}