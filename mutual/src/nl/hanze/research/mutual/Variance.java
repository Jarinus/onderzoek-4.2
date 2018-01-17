package nl.hanze.research.mutual;

import java.util.stream.Stream;

public class Variance {

    public static double of(Double[] measurements) {
        double average = Average.of(measurements);

        return Stream.of(measurements)
                .map((measurement) -> (measurement - average) * (measurement - average))
                .reduce((a, b) -> a + b)
                .map((total) -> total / measurements.length)
                .orElseThrow(RuntimeException::new);
    }

}
