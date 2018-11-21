package codility

fun solution(A: Array<Int>, K: Int): Array<Int> {
    val arr = A.copyOfRange(0, K-1).reversedArray() + A.copyOfRange(K-1, A.size).reversedArray()
    return arr.reversedArray()
}

fun main(args: Array<String>) {
    println(solution(arrayOf(3, 8, 9, 7, 6), 3).contentToString())
}