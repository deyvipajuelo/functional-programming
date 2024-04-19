package superfunctions.v1;

import superfunctions.v1.classes.consumers.Printer;
import superfunctions.v1.classes.filters.OnlyEvens;
import superfunctions.v1.classes.processors.ToSquare;
import superfunctions.v1.classes.providers.NaturalsNumbers;
import superfunctions.v1.classes.providers.RandomNumbers;
import superfunctions.v1.classes.reducers.MultiplyReducer;
import superfunctions.v1.classes.reducers.SumReducer;
import superfunctions.v1.interfaces.Consumer;

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
