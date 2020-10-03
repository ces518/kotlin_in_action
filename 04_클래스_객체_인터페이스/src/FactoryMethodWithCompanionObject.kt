/**
 * 기존의 경우 일반 사용자와 소셜 유저를 생성하는 2개의 부 생성자가 필요했다.
 * 이를 동반객체를 이용하여 리팩토링
 */
class BasicUser {
    val nickname: String

    constructor(email: String) {
        nickname = email.substringBefore("@")
    }

    constructor(socialId: Int) {
        nickname = getSocialName(socialId)
    }
}

fun getSocialName(socialId: Int): String = "Hello ~ $socialId"


/**
 * 2개의 부생성자가 필요했던 부분을 동반객체를 활용해 팩토리메소드 형태로 리팩토링
 */
class BasicUserCompanionObject private constructor(val nickname: String) {
    companion object {
        fun newSimpleUser(email: String) = BasicUserCompanionObject(email.substringBefore("@"))
        fun newSocialUser(socialId: Int) = BasicUserCompanionObject(getSocialName(socialId))
    }
}

fun main(args: Array<String>) {
    // 기존의 방식
    BasicUser("ncucu.me@kakaocommerce.com")
    BasicUser(1)

    // 팩토리 메소드 사용
    BasicUserCompanionObject.newSimpleUser("ncucu.me@kakaocommerce.com")
    BasicUserCompanionObject.newSocialUser(1)
}