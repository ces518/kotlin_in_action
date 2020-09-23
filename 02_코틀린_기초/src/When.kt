/**
 * 코틀린 에서의 switch는 when 이다.
 * if 와 마찬가지로 값을 만들어내는 식이다.
 * 자바와 달리 break 을 넣지 않아도 된다.
 * 한 분기내에서 여러 값을 매치 패턴으로 사용할 경우 값 사이를 콤마(,) 로 구분한다.
 *
 * 아래 예제는 when 을 본문으로 하는 (식이 본문인 함수) 이다.
 */
fun getMneomonic(color: Color) =
    when (color) {
        Color.RED -> "Richard"
        Color.ORANGE -> "Of"
        Color.YELLOW -> "York"
        Color.GREEN -> "Gave"
        Color.BLUE -> "Battle"
        Color.INDIGO, Color.VIOLET -> "In"
    }

fun main(args: Array<String>) {
    println(getMneomonic(Color.RED))
}

/**
 * 코틀린의 when은 자바의 switch 보다 강력한 기능을 제공한다.
 * 분기 조건에 임의의 객체를 허용한다.
 *
 * setOf() 함수는 코틀린 표준 라이브러리에서 제공하는 함수로, 인자로 전달되는 객체를 원소로 가지는 Set객체 로 만들어 준다.
 * 분기조건에 있는 객체를 매치할 때 동등성 (equality)을 사용한다.
 *
 * 코틀린 1.3 버전 부터는 when의 검사 대상을 변수에 담아 새로운 명칭으로 사용이 가능하다.
 */
fun max(c1: Color, c2: Color) =
    when (setOf(c1, c2)) {
        setOf(Color.RED, Color.YELLOW) -> Color.ORANGE
        setOf(Color.YELLOW, Color.BLUE) -> Color.GREEN
        setOf(Color.BLUE, Color.VIOLET) -> Color.INDIGO
        else -> throw Exception("Dirty Color")
    }

/**
 * 위 함수가 빈번하게 호출된다면 비효율적이게 된다.
 * 매번 비교때 마다 새로운 Set 객체를 생성하기 때문에 호출빈도가 높다면 GC 가 자주 일어나게 되므로 아래와 같이 최적화 해야할 수도 있다.
 * 하지만 아래 방법은 성능적으론 이득이지만, 가독성은 더 떨어진다는 문제가 있다.
 */
fun mixOptimized(c1: Color, c2: Color) =
    when {
        (c1 == Color.RED && c2 == Color.YELLOW) ||
        (c1 == Color.YELLOW && c2 == Color.RED) ->
            Color.ORANGE
        (c1 == Color.YELLOW && c2 == Color.BLUE) ||
        (c1 == Color.BLUE && c2 == Color.YELLOW) ->
            Color.GREEN
        (c1 == Color.BLUE && c2 == Color.VIOLET) ||
        (c1 == Color.VIOLET && c2 == Color.BLUE) ->
            Color.INDIGO
        else -> throw Exception("Dirty Color")
    }
