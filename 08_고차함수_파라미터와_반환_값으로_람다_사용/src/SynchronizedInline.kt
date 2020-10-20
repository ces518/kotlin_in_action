import sun.misc.Lock

/**
 * inline 함수를 정의하면 해당 함수를 호출하는 코드는 실행 시점에 함수 본문으로 바꿔치기 해버린다.
 */
inline fun <T> synchronized(lock: Lock, action: () -> T): T {
    lock.lock()
    try {
        return action()
    } finally {
        lock.unlock()
    }
}

fun main() {
    val l = Lock()

    synchronized(l) {
        /* .. */
    }
}