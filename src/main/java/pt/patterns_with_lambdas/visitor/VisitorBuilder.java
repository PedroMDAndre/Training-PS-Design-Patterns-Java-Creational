package pt.patterns_with_lambdas.visitor;

import java.util.function.Function;

@FunctionalInterface
public interface VisitorBuilder<R> {

    <T> void register(Class<T> type, Function<T, R> function);

}
