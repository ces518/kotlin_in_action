/**
 * 코틀린은 타입 파라미터를 받는 클래스이다.
 * 원소의 타입은 타입 파라미터에 의해 결정된다.
 */
fun main(args: Array<String>) {
    // 코틀린 배열 사용하기
    for (i in args.indices) {
        println("Argument $i is: ${args[i]}")
    }

    // 배열을 생성하는 방법

    // 1. arrayOf
    // 원소를 받아 배열을 생성
    val arr1: Array<Int> = arrayOf(1, 2, 3, 4)

    // 2. arrayOfNulls
    // 파라메터 값 만큼 null 원소를 갖는 배열을 생성
    val arr2: Array<Int?> = arrayOfNulls(4)

    // 3. Array 생성자
    // arrayOf를 사용하지 않고 널이 아닌 배열을 초기화할때 사용
    // 사이즈 파라메터와, 원소 초기화 람다를 받는다.
    val arr3: Array<Int> = Array(4) { 1 }
}