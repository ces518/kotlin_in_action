/**
 * invoke 함수 관례
 */
class Greeter(val greeting: String) {
    operator fun invoke(name: String) {
        println("$greeting, $name!")
    }
}

fun main() {
    val greeter = Greeter("Servus")
    // 아래 코드는 greeter.invoke("Dmitry!") 로 컴파일 된다.
    greeter("Dmitry!")
}