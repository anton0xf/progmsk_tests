package pmtests.lesson1;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {
    @Test
    @SuppressWarnings("ResultOfMethodCallIgnored")
    public void simple_negative() {
        assertThrows(IllegalArgumentException.class, () -> Fibonacci.simple(-1));
    }

    @Test
    public void simple_zeroIs0() {
        assertEquals(BigInteger.ZERO, Fibonacci.simple(0));
    }

    @Test
    public void simple_firstIs1() {
        assertEquals(BigInteger.ONE, Fibonacci.simple(1));
    }

    @Test
    public void simple_secondIs1() {
        assertEquals(BigInteger.ONE, Fibonacci.simple(2));
    }

    @Test
    public void simple_thirdIs2() {
        assertEquals(BigInteger.TWO, Fibonacci.simple(3));
    }

    @Test
    public void simple_forthIs3() {
        assertEquals(BigInteger.valueOf(3), Fibonacci.simple(4));
    }

    @Test
    public void simple_fifthIs5() {
        assertEquals(BigInteger.valueOf(5), Fibonacci.simple(5));
    }

    private void checkSamples(Function<Integer, BigInteger> fn) {
        assertThrows(IllegalArgumentException.class, () -> fn.apply(-1));
        for (int n = 0; n <= 20; n++) {
            assertEquals(Fibonacci.simple(n), fn.apply(n), "%d'th".formatted(n));
        }
    }

    @Test
    public void simple2_sameAsSimple() {
        checkSamples(Fibonacci::simple2);
    }

    @Test
    public void fast_sameAsSimple() {
        checkSamples(Fibonacci::fast);
    }
}