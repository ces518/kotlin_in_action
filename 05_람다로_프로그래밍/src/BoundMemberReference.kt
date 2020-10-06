/**
 * 바운드 멤버 참조
 */
fun main(args: Array<String>) {
    val p = SamplePerson("ncucu", 27)
    val personAgeFunction = SamplePerson::age
    println(personAgeFunction(p))

    // 바운드 멤버참조, 인스턴스를 전달하지 않아도 된다.
    val dmitryAgeFunction = p::age
    println(dmitryAgeFunction())
}