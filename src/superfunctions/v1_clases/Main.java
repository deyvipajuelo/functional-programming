package superfunctions.v1_clases;

import superfunctions.v1_clases.classes.consumers.Printer;
import superfunctions.v1_clases.classes.filters.OnlyEvens;
import superfunctions.v1_clases.classes.processors.ToSquare;
import superfunctions.v1_clases.classes.providers.NaturalsNumbers;
import superfunctions.v1_clases.classes.reducers.MultiplyReducer;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        new Main();
    }

    Main() {
        // 1. Create list of integers
        List<Integer> initialNumbers = SuperFunctions.provide(10, new NaturalsNumbers());
        System.out.println(initialNumbers);

        // 2. Filer the numbers
        List<Integer> filteredNumbers = SuperFunctions.filter(initialNumbers, new OnlyEvens());
        System.out.println(filteredNumbers);

        // 3. Process each number
        List<Integer> processedNumbers = SuperFunctions.process(filteredNumbers, new ToSquare());
        System.out.println(processedNumbers);

        // 4. Show every number on screen
        SuperFunctions.consume(processedNumbers, new Printer());

        // 5. Reduce all the numbers
        System.out.println();
        System.out.println("The total is: "+ SuperFunctions.reduce(processedNumbers, new MultiplyReducer(), 1));

    }
}
