import sun.misc.Lock

/**
 * inline 함수를 사용하면 함수 호출시 함수 본문이 인라인 된다.
 */
inline fun <T> synchronized(lock: Lock, action: () -> T): T {
    lock.lock()
    try {
        return action()
    } finally {
        lock.unlock()
    }
}

/**
 * 아래와 같은 경우에는 람다의 코드를 알 수 없기 때문에 람다 본문은 인라이닝 되지 않는다.
 */
class LockOwner(val lock: Lock) {
    fun runUnderLock(body: () -> Unit) {
        synchronized(lock, body)
    }
}

fun main() {
    val l = Lock()
    synchronized(l) {
        /* .. */
    }
}