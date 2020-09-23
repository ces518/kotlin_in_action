/**
 * 1 ~ 10 까지의 범위 (range) 를 만듦
 */
val oneToTen = 1..0

/**
 * when 을 사용한 fizzBuzz 구현
 */
fun fizzBuzz(i: Int) = when {
    i % 15 == 0 -> "FizzBuzz"
    i % 3 == 0 -> "Fizz"
    i % 5 == 0 -> "Buzz"
    else -> "$i "
}

/**
 * range 의 마지막 수를 제외하고 싶다면 until 키워드를 사용하라.
 */
fun main(args: Array<String>) {
    for (i in 1..100) {
        print(fizzBuzz(i))
    }

    // 100 부터 거꾸로 세며, 2씩 감소한다.
    for (i in 100 downTo  1 step 2) {
        print(fizzBuzz(i))
    }

    for (i in 100 until 100) {

    }
}



