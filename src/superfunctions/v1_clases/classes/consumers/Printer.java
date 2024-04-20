package superfunctions.v1_clases.classes.consumers;

import superfunctions.v1_clases.interfaces.Consumer;

public class Printer implements Consumer {
    @Override
    public void consume(Integer number) {
        System.out.println(number);
    }
}
