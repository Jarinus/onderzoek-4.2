package nl.hanze.research;

import nl.hanze.research.mutual.PrintResults;

public class Research {
    private static final int ITERATIONS = 1000;
    private static final MethodReference METHOD_REFERENCE = new MethodReference();
    private static final Streaming STREAMING = new Streaming();

    public static void main(String[] args) {
        Long[] methodReferenceDurations = new Long[ITERATIONS];
        Long[] streamingDurations = new Long[ITERATIONS];

        for (int i = 0; i < ITERATIONS; i++) {
            methodReferenceDurations[i] = METHOD_REFERENCE.test();
            streamingDurations[i] = STREAMING.test();
        }

        PrintResults.of("[JDK8]Method Reference/Functional Interface Test", methodReferenceDurations);
        PrintResults.of("[JDK8]Streaming Test", streamingDurations);
    }
}
