package pmtests.lesson1;

import java.math.BigInteger;

public class Power {
    public static BigInteger simple(BigInteger base, int exponent) throws IllegalArgumentException {
        if (exponent < 0) {
            throw new IllegalArgumentException("Exponent must be non-negative but it is %d".formatted(exponent));
        }
        BigInteger result = BigInteger.ONE;
        while (exponent > 0) {
            result = result.multiply(base);
            exponent--;
        }
        return result;
    }

    /**
     * Note:
     * b^(2*e) = (b^2)^e
     * b^(e+1) = b^e * b
     * </br>
     * So result can be get by O(log(exponent)) multiplications
     */
    public static BigInteger fast(BigInteger base, int exponent) throws IllegalArgumentException {
        return BigInteger.ZERO;
    }

    public static void main(String[] args) {
        System.out.printf("2^3 = %d%n", simple(BigInteger.TWO, 3));
    }
}
