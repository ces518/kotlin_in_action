/**
 * data class 로 정의함으로써 아래 클래스는 오버라이드된 toString, equals, hashCode 메소드가 생성되어 있다.
 * equals 와 hashCode는 주 생성자에 나열된 프로퍼티 들을 고려해 생성된다.
 */
data class Client(val name: String, val postalCode: Int)

fun main(args: Array<String>) {
    val client = Client("Hello", 10)
    val client2 = client.copy(name = "Hello2", postalCode = 11)

    println("client = $client")
    println("client2 = $client2")
}