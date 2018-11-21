package classical.bitwise

class Parity {

    companion object {
        private fun parity(x: Int): Int {
            var xCopy = x
            var result = 0
            while (xCopy != 0) {
                println("Loop")
                result = result xor (xCopy and 1)
                xCopy = xCopy ushr 1
            }
            return result
        }

        private fun parityOptim(x: Int): Int {
            var xCopy = x
            var result = 0
            while (xCopy != 0) {
                println("Loop")
                result = result xor 1
                xCopy = xCopy and (xCopy - 1)
            }
            return result
        }

        fun println(x: Int) {
            println("Number [$x]")
            println("Parity")
            parity(x)
            println("OptimalParity")
            parityOptim(x)
            println("==================")
        }
    }
}

fun main(args: Array<String>) {
    Parity.println(15)
    Parity.println(16)
}
