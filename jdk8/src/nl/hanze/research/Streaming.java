package nl.hanze.research;

import nl.hanze.research.mutual.HistoricalFigures;
import nl.hanze.research.mutual.Test;

import java.util.Collection;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Streaming extends Test {
    private static final Pattern OMIT_DIGITS = Pattern.compile("\\d+ (?<value>.+)");

    private final Collection<String> values = HistoricalFigures.get();

    @Override
    protected void execute() {
        Collection<String> valuesWithoutId = values.stream()
                .map(new Function<String, Matcher>() {
                    @Override
                    public Matcher apply(String s) {
                        return OMIT_DIGITS.matcher(s);
                    }
                })
                .filter(new Predicate<Matcher>() {
                    @Override
                    public boolean test(Matcher matcher) {
                        return matcher.matches();
                    }
                })
                .map(new Function<Matcher, String>() {
                    @Override
                    public String apply(Matcher matcher) {
                        return matcher.group("value");
                    }
                })
                .collect(Collectors.toList());
    }
}
