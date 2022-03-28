package people_humans

import kotlin.random.Random

fun main() {
    val likes = Random.nextInt(0, 100)
    val lastDigit = likes % 10
    val lastTwoDigits = likes % 100
    val human = if (lastTwoDigits == 11 || lastDigit !== 1) "людям" else "человеку"

    println("Понравилось $likes $human")
}