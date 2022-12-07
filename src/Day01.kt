import java.util.*

/**
 * Day1
 */
fun main() {

    fun part1(input: List<String>): Int {
        var max = 0
        var current = 0

        val iter = input.iterator()
        while (iter.hasNext()) {
            val str = iter.next()
            if (str.isBlank()) {
                if (current > max) {
                    max = current
                }
                current = 0
            } else {
                val calories = str.toInt(10)
                current += calories
            }
        }
        if (current > max) {
            max = current
        }
        return max
    }

    fun part2(input: List<String>): Int {
        val set = TreeSet<Int> { a, b -> b - a }
        var current = 0
        val iter = input.iterator()
        while (iter.hasNext()) {
            val str = iter.next()
            if (str.isBlank()) {
                set.add(current)
                current = 0
            } else {
                val calories = str.toInt(10)
                current += calories
            }
        }
        return set.take(3).sumOf { it }
    }

    val input = readInput("Day01")

    println("Part 1: ${part1(input)}")
    println("Part 2: ${part2(input)}")
}


