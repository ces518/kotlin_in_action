/**
 * setter 의 접근자를 private 으로 지정해 해당 인스턴스 외부에서는 해당값을 변경할수 없다.
 */
class LengthCounter {
    var counter: Int = 0
        private set

    fun addWord(word: String) {
        counter += word.length
    }

}


fun main(args: Array<String>) {
    val lengthCounter = LengthCounter();
    lengthCounter.addWord("Hello")
    println(lengthCounter.counter)
}