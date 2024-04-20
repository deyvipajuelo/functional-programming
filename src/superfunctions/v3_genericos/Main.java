package superfunctions.v3_genericos;

import superfunctions.v3_genericos.interfaces.*;

import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        new Main();
    }

    Main() {
        // 1. Create list of integers
        List<Integer> initialValues = SuperFunctions.provide(10, new Provider<Integer>() {
            Random random = new Random();
            @Override
            public Integer provide() {
                return random.nextInt(10);
            }
        });
        System.out.println(initialValues);

        // 2. Filer the numbers
        List<Integer> filteredValues = SuperFunctions.filter(initialValues, new Predicate<Integer>() {
            @Override
            public boolean test(Integer number) {
                return number % 2 == 0;
            }
        });
        System.out.println(filteredValues);

        // 3. Process each number
        List<Integer> processedNumbers = SuperFunctions.process(filteredValues, new UnaryOperator<Integer>() {
            @Override
            public Integer process(Integer number) {
                return number * number;
            }
        });
        System.out.println(processedNumbers);

        // 3.a. Return every number as string
        List<String> numberAsString = SuperFunctions.process(processedNumbers, new Processor<Integer, String>() {
            @Override
            public String process(Integer number) {
                return "The values is: " + number;
            }
        });
        System.out.println(numberAsString);

        // 4. Show every number on screen
        SuperFunctions.consume(processedNumbers, new Consumer<Integer>() {
            @Override
            public void consume(Integer number) {
                System.out.println(number);
            }
        });

        // 5. Reduce all the numbers
        System.out.println();
        System.out.println("The total is: "+ SuperFunctions.reduce(processedNumbers, 0, new BinaryOperator<Integer>() {
            @Override
            public Integer reduce(Integer numberOne, Integer numberTwo) {
                return numberOne + numberTwo;
            }
        }));

    }
}
