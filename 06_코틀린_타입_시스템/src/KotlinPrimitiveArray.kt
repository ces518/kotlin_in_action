/**
 * 코틀린에서는 배열은 기본적으로 박싱된 타입 이기 때문에
 * 원시타입 배열 생성방식을 제공한다.
 */
fun main(args: Array<String>) {
    // 1. 생성자 사용
    // 사이즈 만큼의 원시 타입의 원소를 갖는 배열을 생성하고 원시타입의 디폴트값으로 초기화한다.
    val intArr1 = IntArray(5)

    // 2. 팩토리 함수 사용
    // 각 원소를 인자로 받는다.
    val intArr2 = intArrayOf(1, 2, 3, 4)

    // 3. 일반 배열과 동일한 방식의 생성자 사용
    val intArr3 = IntArray(5) { 2 }

    // * 코틀린 배열은 컬렉션과 동일하게 확장 함수를 제공한다.
    args.forEachIndexed { index, e ->  println("Argument $index is $e") }
}