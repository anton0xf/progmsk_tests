package pmtests.lesson1;

import org.openjdk.jmh.annotations.Benchmark;

import java.math.BigInteger;

public class PowerBenchmark {
    @Benchmark
    public BigInteger simple_3() {
        return Power.simple(BigInteger.TWO, 3);
    }

    @Benchmark
    public BigInteger simple_10() {
        return Power.simple(BigInteger.TWO, 10);
    }

    @Benchmark
    public BigInteger simple_100() {
        return Power.simple(BigInteger.TWO, 100);
    }

    @Benchmark
    public BigInteger simple_1000() {
        return Power.simple(BigInteger.TWO, 1000);
    }

    @Benchmark
    public BigInteger simple_1e4() {
        return Power.simple(BigInteger.TWO, 10_000);
    }

    @Benchmark
    public BigInteger simple2_3() {
        return Power.simple2(BigInteger.TWO, 3);
    }

    @Benchmark
    public BigInteger simple2_10() {
        return Power.simple2(BigInteger.TWO, 10);
    }

    @Benchmark
    public BigInteger simple2_100() {
        return Power.simple2(BigInteger.TWO, 100);
    }

    @Benchmark
    public BigInteger simple2_1000() {
        return Power.simple2(BigInteger.TWO, 1000);
    }

    @Benchmark
    public BigInteger simple2_1e4() {
        return Power.simple2(BigInteger.TWO, 10_000);
    }

    @Benchmark
    public BigInteger fast_3() {
        return Power.fast(BigInteger.TWO, 3);
    }

    @Benchmark
    public BigInteger fast_10() {
        return Power.fast(BigInteger.TWO, 10);
    }

    @Benchmark
    public BigInteger fast_100() {
        return Power.fast(BigInteger.TWO, 100);
    }

    @Benchmark
    public BigInteger fast_1000() {
        return Power.fast(BigInteger.TWO, 1000);
    }

    @Benchmark
    public BigInteger fast_1e4() {
        return Power.fast(BigInteger.TWO, 10_000);
    }

    @Benchmark
    public BigInteger fast2_3() {
        return Power.fast2(BigInteger.TWO, 3);
    }

    @Benchmark
    public BigInteger fast2_10() {
        return Power.fast2(BigInteger.TWO, 10);
    }

    @Benchmark
    public BigInteger fast2_100() {
        return Power.fast2(BigInteger.TWO, 100);
    }

    @Benchmark
    public BigInteger fast2_1000() {
        return Power.fast2(BigInteger.TWO, 1000);
    }

    @Benchmark
    public BigInteger fast2_1e4() {
        return Power.fast2(BigInteger.TWO, 10_000);
    }

    @Benchmark
    public BigInteger fastRecursive_3() {
        return Power.fastRecursive(BigInteger.TWO, 3);
    }

    @Benchmark
    public BigInteger fastRecursive_10() {
        return Power.fastRecursive(BigInteger.TWO, 10);
    }

    @Benchmark
    public BigInteger fastRecursive_100() {
        return Power.fastRecursive(BigInteger.TWO, 100);
    }

    @Benchmark
    public BigInteger fastRecursive_1000() {
        return Power.fastRecursive(BigInteger.TWO, 1000);
    }

    @Benchmark
    public BigInteger fastRecursive_1e4() {
        return Power.fastRecursive(BigInteger.TWO, 10_000);
    }
}
