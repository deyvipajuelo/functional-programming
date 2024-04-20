package superfunctions.v1_clases.classes.processors;

import superfunctions.v1_clases.interfaces.Processor;

public class ToCube implements Processor {
    @Override
    public Integer process(Integer number) {
        return number * number *number;
    }
}
