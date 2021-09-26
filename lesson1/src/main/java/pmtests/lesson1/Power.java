package pmtests.lesson1;

import java.math.BigInteger;

public class Power {
    public static BigInteger simple(BigInteger base, int exponent) throws IllegalArgumentException {
        BigInteger result = BigInteger.ONE;
        while (exponent > 0) {
            result = result.multiply(base);
            exponent--;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.printf("2^3 = %d%n", simple(BigInteger.TWO, 3));
    }
}
