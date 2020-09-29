/**
 * HashCode 오버라이딩
 */
class ClientHashCode(val name: String, val postalCode: Int) {
    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + postalCode
        return result
    }
}