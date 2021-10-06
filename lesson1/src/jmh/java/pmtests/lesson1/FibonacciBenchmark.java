package pmtests.lesson1;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Param;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

import java.math.BigInteger;

@State(Scope.Benchmark)
public class FibonacciBenchmark {
    @Param({"10", "100", "1000", "10000"})
    public int n;

    @Benchmark
    public BigInteger simple() {
        return Fibonacci.simple(n);
    }

    @Benchmark
    public BigInteger simple2() {
        return Fibonacci.simple2(n);
    }

    @Benchmark
    public BigInteger fast() {
        return Fibonacci.fast(n);
    }
}
