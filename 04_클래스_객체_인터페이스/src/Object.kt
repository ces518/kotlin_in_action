/**
 * object 키워드를 통해 객체선언을 할 수 있다.
 * 코틀린은 object 키워드를 이용해 언어레벨에서 싱글턴을 지원한다.
 */
class Person
object Paroll {
    val allEmployees = arrayListOf<Person>()

    fun calcuateSalary() {
        for (person in allEmployees) {
            //...
        }
    }
}

fun main(args: Array<String>) {
    Paroll.calcuateSalary()
    Paroll.allEmployees.add(Person())
}
