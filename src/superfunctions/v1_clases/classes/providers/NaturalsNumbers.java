package superfunctions.v1_clases.classes.providers;

import superfunctions.v1_clases.interfaces.Provider;

public class NaturalsNumbers implements Provider {

    private static int initialValue = 1;

    @Override
    public Integer provide() {
        return initialValue++;
    }
}
