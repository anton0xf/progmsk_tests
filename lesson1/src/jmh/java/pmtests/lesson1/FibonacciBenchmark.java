package pmtests.lesson1;

import org.openjdk.jmh.annotations.Benchmark;

import java.math.BigInteger;

public class FibonacciBenchmark {
    @Benchmark
    public BigInteger simple_10() {
        return Fibonacci.simple(10);
    }

    @Benchmark
    public BigInteger simple_100() {
        return Fibonacci.simple(100);
    }

    @Benchmark
    public BigInteger simple_1000() {
        return Fibonacci.simple(1000);
    }

    @Benchmark
    public BigInteger simple_1e4() {
        return Fibonacci.simple(10_000);
    }

    @Benchmark
    public BigInteger simple2_10() {
        return Fibonacci.simple2(10);
    }

    @Benchmark
    public BigInteger simple2_100() {
        return Fibonacci.simple2(100);
    }

    @Benchmark
    public BigInteger simple2_1000() {
        return Fibonacci.simple2(1000);
    }

    @Benchmark
    public BigInteger simple2_1e4() {
        return Fibonacci.simple2(10_000);
    }

    @Benchmark
    public BigInteger fast_10() {
        return Fibonacci.fast(10);
    }

    @Benchmark
    public BigInteger fast_100() {
        return Fibonacci.fast(100);
    }

    @Benchmark
    public BigInteger fast_1000() {
        return Fibonacci.fast(1000);
    }

    @Benchmark
    public BigInteger fast_1e4() {
        return Fibonacci.fast(10_000);
    }
}
