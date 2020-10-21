data class Person(val name: String, val age: Int)

/**
 * 인라인된 람다 내에서의 return 은 넌로컬 return이다.
 * 이는 람다가 아닌 람다를 감싸고 있는 함수르 return 시킨다.
 * 인라인 된 코드가 어떻게 동작하는지 생각해본다면 당연한 것이다.
 */
fun lookForAlice(people: List<Person>) {
    people.forEach {
        if (it.name == "Alice") {
            println("Find Alice")
            return
        }
    }
    println("Not Found")
}