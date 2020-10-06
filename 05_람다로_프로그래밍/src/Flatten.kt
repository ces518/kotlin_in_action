/**
 * 리스트[리스트] 구조를 평평하게 펴기만 해야할때 flatten 을 사용한다.
 */
fun main(args: Array<String>) {
    val books = listOf(listOf("ncucu", "ncucume"), listOf("ncucu1", "ncucu2"))
    books.flatten()
}