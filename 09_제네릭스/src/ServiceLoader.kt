import java.util.*
import javax.xml.ws.Service

inline fun <reified T> loadService() = ServiceLoader.load(T::class.java)

fun main() {
    // 코틀린에서 Service::class.java 는 자바의 Service.class 와 완전히 동일한 역할을 하는 코드이다,
    val serviceImpl = ServiceLoader.load(Service::class.java)

    // 타입 파라미터 실체화를 이용한 간결한 호출함수 위의 코드와 동일한 역할을 한다.
    val serviceImpl2 = loadService<Service>()
}