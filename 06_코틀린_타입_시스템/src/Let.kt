fun sendEmailTo(email: String) {
    println("Sending email to $email")
}

/**
 * let과 안전한 연사자를 사용해 null 객체를 다룰때 좀 더 간결해지는 예제이다.
 */
fun main(args: Array<String>) {
    var email: String? = "ncucu.me@kakaocommerce.com"

    // email 이 null 이 아닐경우 let 의 람다로 전달되어 sendEmailTo 함수가 호출된다.
    email?.let { sendEmailTo(it) }
}