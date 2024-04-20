package superfunctions.v1_clases.classes.reducers;

import superfunctions.v1_clases.interfaces.Reducer;

public class MultiplyReducer implements Reducer {
    @Override
    public Integer reduce(Integer numberOne, Integer numberTwo) {
        return numberOne * numberTwo;
    }
}
