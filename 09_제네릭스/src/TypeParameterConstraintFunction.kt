/**
 * 타입 파라미터 제약하는 함수를 선언
 * 아래의 max 함수에 들어오는 파라미터는 Comparable 을 구현하는 클래스의 인스턴스여야만 한다.
 */
fun <T: Comparable<T>> max(first: T, second: T) =
    if (first > second) first else second