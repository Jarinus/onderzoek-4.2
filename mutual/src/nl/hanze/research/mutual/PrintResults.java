package nl.hanze.research.mutual;

public class PrintResults {

    public static void of(String caption, Long[] measurements) {
        String message = caption +
                "\n-\taverage: " +
                Average.of(measurements) +
                "\n-\tvariance: " +
                Variance.of(measurements);

        System.out.println(message);
    }

}
