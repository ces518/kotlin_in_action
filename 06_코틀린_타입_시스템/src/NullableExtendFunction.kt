/**
 * 널이 될수 있는 수신 객체에 대한 확장 함수 호출
 * 안전한 호출(?.) 없이도 널이 될 수 있는 수신 객체 타입에 대해 선언된 확장함수 호출이 가능하다.
 * null 이 들어오는 겨우를 적절히 처리한다.
 */

fun String?.isNullOrBlank(): Boolean =
        this == null || this.isBlank()

fun verifyUserInput(input: String?) {
    if (input.isNullOrBlank()) {
        println("Please fill in the required fields")
    }
}

fun main(args: Array<String>) {
    verifyUserInput("")
    verifyUserInput(null)
}