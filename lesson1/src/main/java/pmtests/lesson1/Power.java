package pmtests.lesson1;

import java.math.BigInteger;

public class Power {
    public static final Sequence<BigInteger> SEQUENCE
            = new Sequence<>(BigInteger.ONE, BigInteger::multiply, b -> b.multiply(b));

    private static void assertExponentIsNonNegative(int exponent) {
        if (exponent < 0) {
            throw new IllegalArgumentException("Exponent must be non-negative but it is %d".formatted(exponent));
        }
    }

    public static BigInteger simple(BigInteger base, int exponent) throws IllegalArgumentException {
        assertExponentIsNonNegative(exponent);
        BigInteger result = BigInteger.ONE;
        while (exponent > 0) {
            result = result.multiply(base);
            exponent--;
        }
        return result;
    }

    public static BigInteger simple2(BigInteger base, int exponent) throws IllegalArgumentException {
        return SEQUENCE.simpleNth(base, exponent);
    }

    /**
     * Note:
     * b^(2*e) = (b^2)^e
     * b^(e+1) = b^e * b
     * </br>
     * So result can be get by O(log(exponent)) multiplications. For example:
     * <code>
     * b^7 = (1 * b) * b^6 = (1 * b) * (b*b)^3
     * =[b1 := b*b]= (1 * b * b1) * b1^2 = (1 * b * b1) * (b1*b1)^1 = 1 * b * b1 * (b1*b1)
     * = 1 * b * (b*b) * ((b*b)*(b*b))
     * </code>
     */
    public static BigInteger fast(BigInteger base, int exponent) throws IllegalArgumentException {
        assertExponentIsNonNegative(exponent);
        BigInteger curBase = base;
        int curExponent = exponent;
        BigInteger result = BigInteger.ONE;
        while (curExponent > 0) {
            if (curExponent % 2 == 0) {
                curBase = curBase.multiply(curBase);
                curExponent /= 2;
            } else {
                curExponent--;
                result = result.multiply(curBase);
            }
        }
        return result;
    }

    public static BigInteger fast2(BigInteger base, int exponent) throws IllegalArgumentException {
        return SEQUENCE.fastNth(base, exponent);
    }

    public static BigInteger fastRecursive(BigInteger base, int exponent) throws IllegalArgumentException {
        assertExponentIsNonNegative(exponent);
        return fastIterate(BigInteger.ONE, base, exponent);
    }

    private static BigInteger fastIterate(BigInteger acc, BigInteger base, int exponent) {
        if (exponent == 0) {
            return acc;
        }
        if (exponent % 2 == 0) {
            return fastIterate(acc, base.multiply(base), exponent / 2);
        }
        return fastIterate(acc.multiply(base), base, exponent - 1);
    }

    public static void main(String[] args) {
        System.out.printf("2^3 = %d%n", simple(BigInteger.TWO, 3));
    }
}
