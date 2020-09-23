import java.lang.IllegalArgumentException

/**
 * 식을 트리구조로 저장한다.
 * Num 객체는 항상 리프 노드이며, Sum 은 자식이 둘 있는 중간 노드이다.
 * 식을 위한 Expr 인터페이스를 선언하며, 공통 타입 역할을 위한 마커 인터페이스로 사용한다.
 *
 * (1 + 2) + 4 라는 식을 저장한다면, Sum(Sum(Num(1), Num(2)), Num(4)) 라는 구조의 객체가 생성된다.
 * 위 식의 결과 값은 7이여야만 한다.
 *
 */
interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

/**
 * 자바 스타일로 만든 함수
 * 자바에서는 instanceof 키워드를 사용해 변수타입을 검사한다.
 * 코틀린에서는 is 키워드를 사용해 변수 타입을 검사한다.
 * 자바에서는 명시적으로 변수 타입을 캐스팅해주어야 한다.
 * 하지만 코틀린에서는 is 키워드로 타입 검사를 하고나면 컴파일러가 대신 캐스팅을 해준다.
 * 이를 스마트 캐스팅 이라고 한다.
 * 주의점은 그 값이 바뀔수 없는 경우에만 동작한다.
 * ex) val이 아니거나 val이지만 커스텀 접근자를 사용할 경우 항상 같은 값을 반환함을 보장하지 않기 때문
 * 원하는 타입으로 명시적으로 캐스팅 할때는 as 키워드를 사용한다.
 */
fun eval(e: Expr): Int {
    if (e is Num) {
        val n = e as Num
        return n.value
    }
    if (e is Sum) {
        return eval(e.right) + eval(e.left)
    }
    throw IllegalArgumentException("Unknown expression")
}

/**
 * 코틀린 스타일의 if 를 사용해서 리팩토링
 * 식이 본문인 함수와 스마트 캐스트를 활용함
 */
fun evalKotlinUseIf(e: Expr): Int =
    if (e is Num) {
        e.value
    } else if (e is Sum) {
        eval(e.right) + eval(e.left)
    } else {
        throw IllegalArgumentException("Unknown expression")
    }

/**
 * 위 코드를 when 을 사용해서 리팩토링
 */
fun evalKoltinUseWhen(e: Expr): Int =
    when (e) {
        is Num -> e.value
        is Sum -> eval(e.right) + eval(e.right)
        else -> throw IllegalArgumentException("Unknown Expression")
    }

/**
 * if, when 모두 분기에 블록을 사용할수 있다.
 * 블록을 사용할 경우 블록 내 맨 마지막 식이 결과값이 된다.
 * 블록의 마지막 식이 결과 라는 규칙은 블록이 값을 만들어내야 하는 경우 항상 성립한다.
 */
fun evalWithLogging(e: Expr): Int =
    when (e) {
        is Num -> {
            println("num: ${e.value}")
            e.value
        }
        is Sum -> {
            val left = eval(e.right)
            val right = eval(e.right)
            println("sum: $left + $right")
            left + right
        }
        else -> throw IllegalArgumentException("Unknown Expression")
    }