package pmtests.lesson1;

import java.math.BigInteger;

public class Power {
    public static BigInteger simple(BigInteger base, int exponent) throws IllegalArgumentException {
        return BigInteger.ZERO;
    }

    public static void main(String[] args) {
        System.out.printf("2^3 = %d%n", simple(BigInteger.TWO, 3));
    }
}
