/**
 * toString 오버라이드
 */
class ClientToString(val name: String, val postalCode: Int) {
    override fun toString(): String {
        return "Client(name='$name', postalCode=$postalCode)"
    }
}