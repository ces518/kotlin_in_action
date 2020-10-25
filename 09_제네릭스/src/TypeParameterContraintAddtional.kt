import java.lang.Appendable

/**
 * 타입 파라미터의 여러개의 제약 조건을 걸수도 있다.
 * 아래 예제 코드에서 T 는 CharSequence 이고, Appendable 을 구현하고 있어야 한다.
 */
fun <T> ensureTrailingPeriod(seq: T)
    where T : CharSequence, T: Appendable {
        if (!seq.endsWith('.')) {
            seq.append('.')
        }
}