package nl.hanze.research.mutual;

import java.util.stream.Stream;

public class Average {

    public static double of(Double[] measurements) {
        return Stream.of(measurements)
                .reduce((a, b) -> a + b)
                .map((total) -> total / measurements.length)
                .orElseThrow(RuntimeException::new);
    }

}
