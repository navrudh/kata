package eopi.bitwise;

public class BitwiseArithmatic {

    public static long multiply(long a, long b) {
        long result = 0;
        while (b != 0) {
            if ((b & 1) != 0) {
                result = add(result, a);
            }
            b >>>= 1;
            a <<= 1;
        }
        return result;
    }

    private static long add(long a, long b) {
        long result = 0;
        long copyA = a, copyB = b;
        long bitPlace = 1;
        while (copyA != 0 || copyB != 0) {
            long aPlace = a & bitPlace, bPlace = b & bitPlace;
        }
        return result;
    }
}