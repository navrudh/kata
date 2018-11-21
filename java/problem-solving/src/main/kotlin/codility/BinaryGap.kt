package codility

fun solution(N: Int): Int {
    val binaryString = N.toString(2)
    println(binaryString)

    var one = false
    var zero = false

    var count = 0
    var gapLengths: MutableList<Int> = mutableListOf(0)
    for (c in binaryString) {
        if (one && zero && c == '1') {
            one = false
            zero = false
            gapLengths.add(count)
            count = 0
        }
        if (c == '1') one = true
        if (c == '0') zero = true
        if (one && zero && c == '0') {
            count++
        }
    }
    return gapLengths.max()!!
}

fun main(args: Array<String>) {
    print("binaryGaps: " + solution(1041))
}

