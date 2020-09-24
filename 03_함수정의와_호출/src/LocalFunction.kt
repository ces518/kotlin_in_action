import java.lang.IllegalArgumentException

class User(val id: Int, val name: String, val address: String)

/**
 * 필드 검증 로직이 중복된다.
 */
fun saveUser(user: User) {
    if (user.name.isEmpty()) {
        throw IllegalArgumentException()
    }

    if (user.address.isEmpty()) {
        throw IllegalArgumentException()
    }

    // DB SAVE
}

/**
 * 중복되는 필드 검증 로직을 로컬 함수를 이용해 제거
 * 로컬 함수는 자신이 속한 바깥 함수의 모든 파라메터와 변수에 접근할 수 있다.
 */
fun saveUserWithLocalFunction(user: User) {
    fun validate(value: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException("${user.id}...")
        }
    }
    validate(user.name)
    validate(user.address)

    // DB SAVE
}

/**
 * 필드 검증 로직을 확장 함수로 User 에 등록한다.
 */
fun User.validateBeforeSave() {
    fun validate(value: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException("$id...")
        }
    }
    validate(name)
    validate(address)
}

fun saveUserUseExtendFunction(user: User) {
    user.validateBeforeSave()
    // DB SAVE
}