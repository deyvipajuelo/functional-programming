package superfunctions.v1.classes.consumers;

import superfunctions.v1.interfaces.Consumer;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Printer implements Consumer {
    @Override
    public void consume(Integer number) {
        System.out.println(number);
    }
}
