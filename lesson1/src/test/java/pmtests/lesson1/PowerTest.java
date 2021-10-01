package pmtests.lesson1;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.util.function.BiFunction;

import static org.junit.jupiter.api.Assertions.*;

class PowerTest {
    @Test
    @SuppressWarnings("ResultOfMethodCallIgnored")
    public void simple_negativePowerOfTen() {
        assertThrows(IllegalArgumentException.class, () -> Power.simple(BigInteger.TEN, -1));
    }

    @Test
    public void simple_zeroPowerOfZero() {
        assertEquals(BigInteger.ONE, Power.simple(BigInteger.ZERO, 0));
    }

    @Test
    public void simple_zeroPowerOfTen() {
        assertEquals(BigInteger.ONE, Power.simple(BigInteger.TEN, 0));
    }

    @Test
    public void simple_firstPowerOfTen() {
        assertEquals(BigInteger.TEN, Power.simple(BigInteger.TEN, 1));
    }

    @Test
    public void simple_thirdPowerOfTwo() {
        assertEquals(BigInteger.valueOf(8), Power.simple(BigInteger.TWO, 3));
    }

    @Test
    @SuppressWarnings("ResultOfMethodCallIgnored")
    public void fast_negativePowerOfTen() {
        assertThrows(IllegalArgumentException.class, () -> Power.fast(BigInteger.TEN, -1));
    }

    private static void checkPowerFn(BigInteger base, int exponent,
                                     BiFunction<BigInteger, Integer, BigInteger> powerFn) {
        assertEquals(Power.simple(base, exponent), powerFn.apply(base, exponent),
                "%d ^ %d".formatted(base, exponent));
    }

    private void checkSamples(BiFunction<BigInteger, Integer, BigInteger> powerFn) {
        for (int b = -2; b <= 3; b++) {
            for (int e = 0; e <= 10; e++) {
                checkPowerFn(BigInteger.valueOf(b), e, powerFn);
            }
        }
    }

    @Test
    public void fast_sameAsSimple() {
        checkSamples(Power::fast);
    }

    @Test
    @SuppressWarnings("ResultOfMethodCallIgnored")
    public void fastRecursive_negativePowerOfTen() {
        assertThrows(IllegalArgumentException.class, () -> Power.fastRecursive(BigInteger.TEN, -1));
    }

    @Test
    public void fastRecursive_sameAsSimple() {
        checkSamples(Power::fastRecursive);
    }
}
