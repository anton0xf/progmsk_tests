package pmtests.lesson1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class PowerTest {
    @Test
    void simple_zeroPowerOfTen() {
        Assertions.assertEquals(BigInteger.ONE, Power.simple(BigInteger.TEN, 0));
    }

    @Test
    void simple_firstPowerOfTen() {
        Assertions.assertEquals(BigInteger.TEN, Power.simple(BigInteger.TEN, 1));
    }
}
