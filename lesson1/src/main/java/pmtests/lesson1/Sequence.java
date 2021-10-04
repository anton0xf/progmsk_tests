package pmtests.lesson1;

import java.util.function.BiFunction;

public class Sequence<T> {
    private final T neutral;
    private final BiFunction<T, T, T> sumFn;

    private static void assertNIsNonNegative(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("N must be non-negative but it is %d".formatted(n));
        }
    }

    public Sequence(T neutral, BiFunction<T, T, T> sumFn) {
        this.neutral = neutral;
        this.sumFn = sumFn;
    }

    public T simpleNth(T first, int n) {
        assertNIsNonNegative(n);
        T result = neutral;
        for (int i = n; i > 0; i--) {
            result = sumFn.apply(result, first);
        }
        return result;
    }

    public T fastNth(T first, int n) {
        assertNIsNonNegative(n);
        T val = first;
        int i = n;
        T result = neutral;
        while (i > 0) {
            if (i % 2 == 0) {
                val = sumFn.apply(val, val);
                i /= 2;
            } else {
                i--;
                result = sumFn.apply(result, val);
            }
        }
        return result;
    }
}
