package pt.patterns_with_lambdas.factory.factory;

import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public interface Factory<T> extends Supplier<T> {

    default T newInstance() {
        return this.get();
    }

    default List<T> create5Objects() {
        return IntStream.range(0, 5)
                .mapToObj(index -> this.newInstance())
                .toList();
    }

    static <T> Factory<T> createFactoryForSingleton(Supplier<T> supplier) {
        T singleton = supplier.get();
        return () -> singleton; // the factory created will always return the object created above.
    }

    static <T> Factory<T> createFactory(Supplier<T> supplier) {
        return supplier::get;
    }

    static <T, R> Factory<T> createFactory(Function<R, T> constructor, R r) {
        return () -> constructor.apply(r);
    }

}
