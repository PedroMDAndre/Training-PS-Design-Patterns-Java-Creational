package pt.patterns_with_lambdas.chaining.function;

import java.util.Objects;

@FunctionalInterface
public interface Function<T, R> {

    R apply(T t);

    default <V> Function<T, V> andThen(Function<R, V> other) {
        Objects.requireNonNull(other);
        return (T t) -> other.apply(this.apply(t));
    }

    default <V> Function<V, R> composing(Function<V, T> other) {
        Objects.requireNonNull(other);
        return (V v) -> {
            T t = other.apply(v);
            return this.apply(t);
        };
    }

    static <T> Function<T, T> identity() {
        return t -> t;
    }

}
