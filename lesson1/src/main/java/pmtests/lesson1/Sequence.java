package pmtests.lesson1;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Sequence<T> {
    private final T neutral;
    private final BiFunction<T, T, T> nextFn;
    private final Function<T, T> doubleFn;

    public Sequence(T neutral, BiFunction<T, T, T> nextFn, Function<T, T> doubleFn) {
        this.neutral = neutral;
        this.nextFn = nextFn;
        this.doubleFn = doubleFn;
    }

    public T fastNth(T first, int n) {
        T val = first;
        int i = n;
        T result = neutral;
        while (i > 0) {
            if (i % 2 == 0) {
                val = doubleFn.apply(val);
                i /= 2;
            } else {
                i--;
                result = nextFn.apply(result, val);
            }
        }
        return result;
    }
}
