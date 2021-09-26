package pmtests.lesson1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.util.List;

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

    private static void checkFast(BigInteger base, int exponent) {
        assertEquals(Power.simple(base, exponent), Power.fast(base, exponent));
    }

    @Test
    public void fast_sameAsSimple() {
        for (int b = -2; b <= 3; b++) {
            for (int e = 0; e <= 5; e++) {
                checkFast(BigInteger.valueOf(b), e);
            }
        }
    }
}
