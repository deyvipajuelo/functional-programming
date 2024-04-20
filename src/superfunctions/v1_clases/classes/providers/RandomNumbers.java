package superfunctions.v1_clases.classes.providers;

import superfunctions.v1_clases.interfaces.Provider;

import java.util.Random;

public class RandomNumbers implements Provider {

    Random random = new Random();

    @Override
    public Integer provide() {
        return random.nextInt(20);
    }
}
