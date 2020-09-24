/**
 * setOf 외에도 아래와 같은 방법으로 다양한 컬렉션을 생성할 수 있다.
 * map을 생성할때는 to 를 사용하는데 이는 키워드가 아닌 일반 함수이다.
 * 코틀린은 코틀린의 컬렉션을 사용하지않고 표준 자바 컬렉션을 사용한다.
 * 이는 자바와 상호작업하게 훨씬 쉽게 때문이다.
 */
val set = hashSetOf(1, 7, 53)
val list = arrayListOf(1 , 7, 53)
val map = hashMapOf(1 to "one", 7 to "seven", 53 to "fifty-three")

/**
 * 컬렉션은 다양한 함수를 제공한다.
 * last() 함수는 가장 마지막 원소를 가져온다.
 * max() 는 최대 값을 가져온다.
 */
fun main(args: Array<String>) {
    val strings = listOf("first", "second", "fourteenth")
    strings.last()

    val numbers = setOf(1, 14, 2)
    numbers.max()
}
