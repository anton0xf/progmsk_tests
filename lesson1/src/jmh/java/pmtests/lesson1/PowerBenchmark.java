package pmtests.lesson1;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Param;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

import java.math.BigInteger;

@State(Scope.Benchmark)
public class PowerBenchmark {
    @Param({"3", "10", "100", "1000", "10000"})
    public int exponent;

    @Benchmark
    public BigInteger simple() {
        return Power.simple(BigInteger.TWO, exponent);
    }

    @Benchmark
    public BigInteger simple2() {
        return Power.simple2(BigInteger.TWO, exponent);
    }

    @Benchmark
    public BigInteger fast() {
        return Power.fast(BigInteger.TWO, exponent);
    }

    @Benchmark
    public BigInteger fast2() {
        return Power.fast2(BigInteger.TWO, exponent);
    }

    @Benchmark
    public BigInteger fastRecursive() {
        return Power.fastRecursive(BigInteger.TWO, exponent);
    }
}
