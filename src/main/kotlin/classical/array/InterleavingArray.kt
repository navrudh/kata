package classical.array

tailrec fun sortedInterleave(sortedInts: List<Int>, outs: List<Int>, smallestIdxFirst: Boolean): List<Int> {
    if (sortedInts.isEmpty()) return outs

    return if (smallestIdxFirst) sortedInterleave(sortedInts.drop(1), outs.plus(sortedInts.first()), false)
    else sortedInterleave(sortedInts.dropLast(1), outs.plus(sortedInts.last()), true)
}

fun sortedInterleave(ints: List<Int>, smallestIdxFirst: Boolean = true): List<Int> {
    return sortedInterleave(ints.sorted(), emptyList(), smallestIdxFirst)
}

fun MutableList<Int>.swap(index1: Int, index2: Int) {
    val tmp = this[index1] // 'this' corresponds to the list
    this[index1] = this[index2]
    this[index2] = tmp
}

fun localInterleave(ints: List<Int>): List<Int> {
    if (ints.size < 2) return ints
    val mutableInts: MutableList<Int> = ints.toMutableList()
    for (i in 1 until mutableInts.size) {
        if ((((i and 1) == 1) && (mutableInts[i] < mutableInts[i - 1]))
                ||
                (((i and 1) == 0) && (mutableInts[i] > mutableInts[i - 1]))
        ) mutableInts.swap(i, i - 1)
    }
    return mutableInts
}

fun main(args: Array<String>) {
    println(sortedInterleave(listOf(1, 2, 3, 4, 5), true))
    println(localInterleave(listOf(1, 2, 3, 4, 5, 6, 3, 2, 1)))
}