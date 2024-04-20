package superfunctions.v2_inline;

import superfunctions.v2_inline.interfaces.*;

import java.util.ArrayList;
import java.util.List;

public class SuperFunctions {

    static List<Integer> provide(Integer quantity, Provider provider) {
        List<Integer> result = new ArrayList<>();
        for (int i=0; i<quantity; i++ ) {
            result.add(provider.provide());
        }
        return result;
    }

    static List<Integer> filter(List<Integer> numbers, Predicate predicate) {
        List<Integer> result = new ArrayList<>();
        for (Integer number : numbers) {
            if (predicate.test(number)) result.add(number);
        }
        return result;
    }

    static List<Integer> process(List<Integer> numbers, Processor processor) {
        List<Integer> result = new ArrayList<>();
        for (Integer number : numbers) {
            result.add(processor.process(number));
        }

        return result;
    }

    static List<Integer> consume(List<Integer> numbers, Consumer consumer) {
        for (Integer number : numbers) {
            consumer.consume(number);
        }

        return numbers;
    }

    static int reduce(List<Integer> numbers, Integer identity, Reducer reducer) {
        int total = identity;
        for (Integer number : numbers) {
            total = reducer.reduce(total, number);
        }

        return total;
    }

}
