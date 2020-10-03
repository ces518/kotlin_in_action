/**
 * 동반 객체에서 인터페이스 구현이 가능하다.
 */
interface UserFactory<T> {
    fun create(name: String): T
}

class MyUser(val name: String) {
    companion object: UserFactory<MyUser> {
        override fun create(name: String): MyUser = MyUser(name)
    }
}

fun main(args: Array<String>) {
    MyUser.create("ncucu")
}