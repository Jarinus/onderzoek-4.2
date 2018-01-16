package nl.hanze.research.mutual;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;

public class HistoricalFigures {

    public static Collection<String> get() {
        Collection<String> historicalFigures = new ArrayList<>();

        InputStream inputStream = HistoricalFigures.class.getResourceAsStream("/significant-historical-figures.txt");
        BufferedReader in = new BufferedReader(new InputStreamReader(inputStream));

        try {
            String line;
            while ((line = in.readLine()) != null) {
                if (line.isEmpty()) {
                    continue;
                }

                historicalFigures.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return historicalFigures;
    }

}
