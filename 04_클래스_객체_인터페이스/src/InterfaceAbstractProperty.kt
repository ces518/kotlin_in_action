interface AbstractUser {
    val nickname: String
}

/**
 * 주생성자에 존재하는 Property 구현
 */
class PrivateUser(override val nickname: String): AbstractUser

/**
 * 커스텀 Getter 를 통한 Property 구현
 */
class SubscribingUser(val email: String): AbstractUser {
    override val nickname: String
        get () = email.substringBefore('@') // 커스텀 Getter
}

/**
 * Property 초기화식을 통한 구현
 */
class FacebookUser(val accountId: Int): AbstractUser {
    override val nickname = getFacebookName(accountId) // 프로퍼티 초기화식
}

fun getFacebookName(accountId: Int): String {
    return "Hello $accountId"
}