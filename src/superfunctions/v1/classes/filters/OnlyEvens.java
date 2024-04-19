package superfunctions.v1.classes.filters;

import superfunctions.v1.interfaces.Predicate;

public class OnlyEvens implements Predicate {
    @Override
    public boolean test(Integer number) {
        return number % 2 == 0;
    }
}
