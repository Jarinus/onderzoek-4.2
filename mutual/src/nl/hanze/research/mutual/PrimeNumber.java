package nl.hanze.research.mutual;

import java.util.ArrayList;
import java.util.Collection;

public class PrimeNumber {
    private static final int MAX = 10000;

    public static final Collection<Integer> calculate() {
        Collection<Integer> primes = new ArrayList<>();

        primes: for (int potentialPrime = 0; potentialPrime < MAX; potentialPrime++) {
            if (potentialPrime == 0 || potentialPrime == 1) {
                continue;
            }

            for (int establishedPrime: primes) {
                if (potentialPrime % establishedPrime == 0) {
                    continue primes;
                }
            }

            primes.add(potentialPrime);
        }

        return primes;
    }

}
