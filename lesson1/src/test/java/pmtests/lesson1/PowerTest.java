package pmtests.lesson1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class PowerTest {
    @Test
    void simple_zeroExponent() {
        Assertions.assertEquals(BigInteger.ONE, Power.simple(BigInteger.TEN, 0));
    }
}
