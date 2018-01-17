package nl.hanze.research;

import nl.hanze.research.mutual.PrintResults;

public class Research {
    private static final int ITERATIONS = 1000;
    private static final MethodReference METHOD_REFERENCE = new MethodReference();
    private static final Streaming STREAMING = new Streaming();

    public static void main(String[] args) {
        Double[] methodReferenceDurations = new Double[ITERATIONS];
        Double[] streamingDurations = new Double[ITERATIONS];

        for (int i = 0; i < ITERATIONS; i++) {
            methodReferenceDurations[i] = METHOD_REFERENCE.test() / 1_000_000.0;
            streamingDurations[i] = STREAMING.test() / 1_000_000.0;
        }

        PrintResults.of("[JDK7]Method Reference/Functional Interface Test", methodReferenceDurations);
        PrintResults.of("[JDK7]Streaming Test", streamingDurations);
    }
}
