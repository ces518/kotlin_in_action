package geometry.shapes

import java.util.Random

/**
 * 코틀린에서는 자바와 동일하게 package 개념이 존재한다.
 * 자바와 동일하게 동작한다.
 */
class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() = height == width
}

fun createRandomRetangle(): Rectangle {
    val random = Random()
    return Rectangle(random.nextInt(), random.nextInt())
}