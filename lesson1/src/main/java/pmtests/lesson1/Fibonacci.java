package pmtests.lesson1;

import java.math.BigInteger;

public class Fibonacci {
    private static final Pair INIT = new Pair(BigInteger.ZERO, BigInteger.ONE);
    private static final Sequence<Pair> SEQUENCE = new Sequence<>(INIT, Pair::sum);

    private static void assertNIsNonNegative(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("N must be non-negative but it is %d".formatted(n));
        }
    }

    public static BigInteger simple(int n) {
        assertNIsNonNegative(n);
        if (n == 0) {
            return INIT.a;
        } else if (n == 1) {
            return INIT.b;
        }
        BigInteger a = INIT.a;
        BigInteger b = INIT.b;
        for (int i = 1; i < n; i++) {
            BigInteger t = b;
            b = a.add(b);
            a = t;
        }
        return b;
    }

    public static BigInteger simple2(int n) {
        assertNIsNonNegative(n);
        if (n == 0) {
            return INIT.a;
        }
        return SEQUENCE.simpleNth(INIT, n - 1).b;
    }

    public static BigInteger fast(int n) {
        assertNIsNonNegative(n);
        if (n == 0) {
            return INIT.a;
        }
        return SEQUENCE.fastNth(INIT, n - 1).b;
    }

    private static class Pair {
        public final BigInteger a, b;

        private Pair(BigInteger a, BigInteger b) {
            this.a = a;
            this.b = b;
        }

        /**
         * See fast_fibonacci.ipynb </br>
         * <pre>
         * p[n+m] = p[n] * p[m] + q[n] * q[m]
         * q[n+m] = (p[n] + q[n]) * q[m] + p[m] * q[n]
         *
         * x = {a: p[n], b: q[n]}
         * y = {a: p[m], b: q[m]}
         *
         * x + y = {
         *   a: (x.a + x.b) * y.b + x.b * y.a,
         *   b: x.a * y.a + x.b * y.b
         * }
         * </pre>
         */
        public static Pair sum(Pair x, Pair y) {
            return new Pair(
                    x.a.multiply(y.a).add(x.b.multiply(y.b)),
                    x.a.add(x.b).multiply(y.b).add(x.b.multiply(y.a))
            );
        }
    }
}
