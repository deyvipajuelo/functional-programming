package superfunctions.v1_clases.classes.filters;

import superfunctions.v1_clases.interfaces.Predicate;

public class OnlyOdds implements Predicate {
    @Override
    public boolean test(Integer number) {
        return number % 2 != 0;
    }
}
