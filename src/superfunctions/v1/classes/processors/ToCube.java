package superfunctions.v1.classes.processors;

import superfunctions.v1.interfaces.Processor;

public class ToCube implements Processor {
    @Override
    public Integer process(Integer number) {
        return number * number *number;
    }
}
