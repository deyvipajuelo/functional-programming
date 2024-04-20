package superfunctions.v2_inline;

import superfunctions.v1_clases.classes.consumers.Printer;
import superfunctions.v1_clases.classes.filters.OnlyEvens;
import superfunctions.v1_clases.classes.processors.ToSquare;
import superfunctions.v1_clases.classes.providers.NaturalsNumbers;
import superfunctions.v1_clases.classes.reducers.MultiplyReducer;
import superfunctions.v2_inline.interfaces.*;

import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        new Main();
    }

    Main() {
        // 1. Create list of integers
        List<Integer> initialNumbers = SuperFunctions.provide(10, new Provider() {
            Random random = new Random();
            @Override
            public Integer provide() {
                return random.nextInt(10);
            }
        });
        System.out.println(initialNumbers);

        // 2. Filer the numbers
        List<Integer> filteredNumbers = SuperFunctions.filter(initialNumbers, new Predicate() {
            @Override
            public boolean test(Integer number) {
                return number % 2 == 0;
            }
        });
        System.out.println(filteredNumbers);

        // 3. Process each number
        List<Integer> processedNumbers = SuperFunctions.process(filteredNumbers, new Processor() {
            @Override
            public Integer process(Integer number) {
                return number * number;
            }
        });
        System.out.println(processedNumbers);

        // 4. Show every number on screen
        SuperFunctions.consume(processedNumbers, new Consumer() {
            @Override
            public void consume(Integer number) {
                System.out.println(number);
            }
        });

        // 5. Reduce all the numbers
        System.out.println();
        System.out.println("The total is: "+ SuperFunctions.reduce(processedNumbers, new Reducer() {
            @Override
            public Integer reduce(Integer numberOne, Integer numberTwo) {
                return numberOne + numberTwo;
            }
        }, 1));

    }
}
