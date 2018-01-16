package nl.hanze.research.mutual;

import java.util.stream.Stream;

public class Average {

    public static double of(Long[] measurements) {
        return Stream.of(measurements)
                .reduce((a, b) -> a + b)
                .map(Long::doubleValue)
                .map((total) -> total / measurements.length)
                .orElseThrow(RuntimeException::new);
    }

}
