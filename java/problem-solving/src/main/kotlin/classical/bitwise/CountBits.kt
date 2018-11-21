package classical.bitwise

class CountBits {

    companion object {

        private fun countBits(x: Int): Int {
            var numBits = 0
            var xCopy = x
            while (xCopy != 0) {
                numBits += (xCopy and 1)
                xCopy = xCopy ushr 1
            }
            return numBits
        }

        fun println(x: Int) {
            println("Number: " + x + " | Binary: " + x.toString(2) + " | Count: " + countBits(x))
        }
    }
}

fun main(args: Array<String>) {
    CountBits.println(1)
    CountBits.println(2)
    CountBits.println(3)
    CountBits.println(12)
    CountBits.println(63)
    CountBits.println(100)
}