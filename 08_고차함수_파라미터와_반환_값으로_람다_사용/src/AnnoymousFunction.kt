/**
 * 로컬 return을 많이 사용해야 한다면, 코드가 장황해질 수 있다.
 * 이런 경우 무명함수를 사용하는것을 추천한다.
 * 무명함수는 기본적으로 로컬 return이다.
 */
fun main() {
    val strings = listOf("A", "B", "C")
    strings.forEach(fun (str) {
        if (str == "C") return
        println(str)
    })
}