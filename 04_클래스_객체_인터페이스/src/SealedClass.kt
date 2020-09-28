/**
 * Sealed 클래스를 사용하면 이를 상속받는 클래스는 반드시 상위 클래스의 내부에 존재해야 한다.
 * sealed 클래스는 자동으로 open 이다.
 * sealed 클래스의 when 분기문에서 디폴트 분기를 사용하지 않으면, 새롭게 추가된 하위클래스에 대한 처리가 없을경우 컴파일러가 알려준다.
 */
sealed class Expr {
    class Num(val value: Int): Expr()
    class Sum(val left: Expr, val right: Expr): Expr()
}

fun eval(e: Expr): Int =
    when (e) {
        is Expr.Num -> e.value
        is Expr.Sum -> eval(e.right) + eval(e.left)
    }
