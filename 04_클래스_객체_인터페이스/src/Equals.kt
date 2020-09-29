/**
 * equals 오버라이딩
 */
class ClientEquals(val name: String, val postalCode: Int) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ClientEquals

        if (name != other.name) return false
        if (postalCode != other.postalCode) return false

        return true
    }
}