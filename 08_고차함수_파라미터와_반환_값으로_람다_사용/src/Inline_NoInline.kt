/**
 * 인라인 함수의 인자로 받는 람다 중 인라이닝 하고 싶지 않은 경우 noinline 키워드를 사용해 인라이닝하지 않을 수 있다.
 */
inline fun foo(inlined: () -> Unit, noinline notInlined: () -> Unit) {

}