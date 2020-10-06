/**
 * 생성자 참조를 사용하면 클래스 생성 작업을 연기하거나, 저장해 둘 수 있다.
 * ::클래스명 형태로 생성자 참조를 만들 수 있다.
 */
fun main(args: Array<String>) {
    val createSamplePerson = ::SamplePerson
    val p = createSamplePerson("ncucu", 27)
    println(p)
}