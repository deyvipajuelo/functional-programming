package superfunctions.v1.classes.reducers;

import superfunctions.v1.interfaces.Reducer;

public class MultiplyReducer implements Reducer {
    @Override
    public Integer reduce(Integer numberOne, Integer numberTwo) {
        return numberOne * numberTwo;
    }
}
