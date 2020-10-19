/**
 * 함수에서 함수를 반환하는 경우는 많지 않지만
 * 매우 유용하다.
 *
 * 특정 조건에 따라 로직이 분기되는 경우 함수를 반환하는 함수를 활용해서 깔끔한 코드 스타일로 가져갈 수 있다.
 *
 */
enum class Delivery { STANDARD, EXPEDITED }

class Order(val itemCount: Int)

fun getShippingCostCaculator(
        delivery: Delivery
) : (Order) -> Double {

    if (delivery == Delivery.EXPEDITED) {
        return { order -> 6 + 2.1 * order.itemCount }
    }
    return { order -> 61.2 * order.itemCount }
}

fun main() {
    val calculator = getShippingCostCaculator(Delivery.EXPEDITED)
    println("Shipping costs ${calculator(Order(3))}")
}