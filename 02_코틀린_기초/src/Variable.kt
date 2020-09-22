/**
 * 타입으로 변수 선언을 시작하면 식과 변수선언을 구분할 수 없다.
 * 때문에 코틀린에서는 키워드로 변수 선언을 시작하는 대신 변수 명 뒤에 타입을 명시하거나 생략을 허용한다.
 * 부동소수점 상수를 사용한다면 변수 타입은 Double 이 된다.
 * 초기화 식을 사용하지 않고 변수를 선언하려면 변수 타입을 반드시 명시해야 한다.
 */
fun main (args: Array<String>) {
    val question = "삶, 우주, 그리고 모든 것에 대한 궁극적인 질문"

    val answer = 42

    val typedAnswer: Int = 42

    val yearsToCompute = 7.5e6 // Double Type

    val notInitializeVariable: Int
    notInitializeVariable = 42
}