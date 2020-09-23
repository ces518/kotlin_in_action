/**
 * in 연산자를 사용해서 컬렉션이나 범위에 원소가 포함되는지 확인이 가능하다.
 */
fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'
fun isNotDigit(c: Char) = c !in '0'..'9'

/**
 * when 에서도 in 연산자를 사용할 수 있다.
 */
fun recognize(c: Char) = when(c) {
    in '0'..'9' -> "It's a digit!"
    in 'a'..'z', in 'A'..'Z' -> "It's a letter!"
    else -> "I don't know.."
}