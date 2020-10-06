/**
 * flatMap 은 람다를 적용한 결과 얻어지는 리스트를 한 리스트로 모은다.
 */
class Book(val title: String, val authors: List<String>)

fun main(args: Array<String>) {
    val books = listOf(Book("titleA", listOf("ncucu", "ncucume")), Book("titleB", listOf("ncucu1", "ncucu2")))
    books.flatMap { it.authors }.toSet()// books 컬렉션 내에 존재한 모든 저자들의 집합을 Set으로 모은다.
}