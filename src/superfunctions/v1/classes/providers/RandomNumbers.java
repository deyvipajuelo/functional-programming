package superfunctions.v1.classes.providers;

import superfunctions.v1.interfaces.Provider;

import java.util.Random;

public class RandomNumbers implements Provider {

    Random random = new Random();

    @Override
    public Integer provide() {
        return random.nextInt(20);
    }
}
