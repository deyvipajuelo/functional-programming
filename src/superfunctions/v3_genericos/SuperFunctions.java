package superfunctions.v3_genericos;

import superfunctions.v3_genericos.interfaces.*;

import java.util.ArrayList;
import java.util.List;

public class SuperFunctions {

    static <T> List<T> provide(Integer quantity, Provider<T> provider) {
        List<T> result = new ArrayList<>();
        for (int i=0; i<quantity; i++ ) {
            result.add(provider.provide());
        }
        return result;
    }

    static <T> List<T> filter(List<T> values, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for (T value : values) {
            if (predicate.test(value)) result.add(value);
        }
        return result;
    }

    static <T, R> List<R> process(List<T> values, Processor<T, R> processor) {
        List<R> result = new ArrayList<>();
        for (T value : values) {
            result.add(processor.process(value));
        }

        return result;
    }

    static <T> List<T> consume(List<T> values, Consumer<T> consumer) {
        for (T value : values) {
            consumer.consume(value);
        }

        return values;
    }

    static <T> T reduce(List<T> numbers, T identity, BinaryOperator<T> reducer) {
        T total = identity;
        for (T number : numbers) {
            total = reducer.reduce(total, number);
        }

        return total;
    }

}
