fun main() {
    val a: Int = readln().toInt()
    val b: Int = readln().toInt()
    val n: Int = readln().toInt()
    var result: Int = 0

    for (i in a..b) {
        if (i % n == 0) {
            result++
        }
    }

    println(result)
}