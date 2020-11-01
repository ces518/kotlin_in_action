/**
 * 코틀린 에서도 사용지점 변성을 지원한다.
 * 파라미터 타입, 로컬 변수 타입, 함수 반환 타입 등 파라미터가 쓰이는 경우 in, out 변경자를 사용할 수 있다.
 * 이때 타입 프로젝션이 일어난다.
 * 아래 함수에서 source 파라미터는 일반적인 MutableList 가 아닌, 프로젝션을 한 타입으로 만든다.
 * source 파라미터는 MutableList 의 메소드중 타입파라미터 T를 반환하는 메소드만 사용할 수 있다.
 */
fun <T> copyData(source: MutableList<out T>, destination: MutableList<T>) {
    for (item in source) {
        destination.add(item)
    }
}