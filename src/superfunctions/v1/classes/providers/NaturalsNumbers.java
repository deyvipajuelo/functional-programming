package superfunctions.v1.classes.providers;

import superfunctions.v1.interfaces.Provider;

public class NaturalsNumbers implements Provider {

    private static int initialValue = 1;

    @Override
    public Integer provide() {
        return initialValue++;
    }
}
