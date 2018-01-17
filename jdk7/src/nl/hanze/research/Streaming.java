package nl.hanze.research;

import nl.hanze.research.mutual.HistoricalFigures;
import nl.hanze.research.mutual.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Streaming extends Test {
    private static final Pattern OMIT_DIGITS = Pattern.compile("\\d+ (?<value>.+)");

    private final Collection<String> values = HistoricalFigures.get();

    @Override
    protected void execute() {
        Collection<String> valuesWithoutId = new ArrayList<>();

        for (String value : values) {
            Matcher matcher = OMIT_DIGITS.matcher(value);

            if (!matcher.find()) {
                continue;
            }

            valuesWithoutId.add(matcher.group("value"));
        }
    }
}
