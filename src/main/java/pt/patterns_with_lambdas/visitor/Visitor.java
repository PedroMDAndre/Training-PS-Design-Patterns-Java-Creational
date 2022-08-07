package pt.patterns_with_lambdas.visitor;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;

@FunctionalInterface
public interface Visitor<R> {

    R visit(Object o);

    static <T, R> ExecutesX<T, R> forType(Class<T> type) {
        return () -> type;
    }

    static <R> Visitor<R> of(Consumer<VisitorBuilder<R>> consumer) {
        Map<Class<?>, Function<Object, R>> registry = new HashMap<>();
        VisitorBuilder<R> visitorBuilder = new VisitorBuilder<>() {
            @Override
            public <T> void register(Class<T> type, Function<T, R> function) {
                registry.put(type, function.compose(o -> type.cast(o)));
            }
        };
        consumer.accept(visitorBuilder);
        return o -> registry.get(o.getClass()).apply(o);
    }

    @FunctionalInterface
    interface ExecutesX<T, R> {

        Class<T> type();

        default ConsumerY<R> execute(Function<T, R> function) {
            return visitorBuilder -> visitorBuilder.register(this.type(), function);
        }

    }

    @FunctionalInterface
    interface ConsumerY<R> extends Consumer<VisitorBuilder<R>> {

        default <T> ExecutesZ<T, R> forType(Class<T> type) {
            return index -> index == 0 ? this : type;
        }

        default ConsumerY<R> andThen(ConsumerY<R> after) {
            return t -> {
                this.accept(t);
                after.accept(t);
            };
        }

    }

    @FunctionalInterface
    interface ExecutesZ<T, R> {

        Object get(int index);

        default Class<T> type() {
            return (Class<T>) get(1);
        }

        default ConsumerY<R> previousConsumer() {
            return (ConsumerY<R>) get(0);
        }

        default ConsumerY<R> execute(Function<T, R> function) {
            return previousConsumer()
                    .andThen(visitorBuilder -> visitorBuilder.register(this.type(), function));
        }

    }

}

