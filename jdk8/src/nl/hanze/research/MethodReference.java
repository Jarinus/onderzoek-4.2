package nl.hanze.research;

import nl.hanze.research.mutual.PrimeNumber;
import nl.hanze.research.mutual.Test;

public class MethodReference extends Test {

    private static void executeRunnable(Runnable runnable) {
        runnable.run();
    }

    @Override
    protected void execute() {
        executeRunnable(PrimeNumber::calculate);
    }
}
