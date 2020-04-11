package com.starczynowski.radek.graphemecounter;

import java.text.BreakIterator;
import java.util.Locale;

public class BreakIteratorCountingStrategy implements CountingStrategy {

    @Override
    public int length(String sequence) {
        var instance = BreakIterator.getCharacterInstance(Locale.ENGLISH);
        instance.setText(sequence);
        var graphemes = 0;
        while(instance.next() != BreakIterator.DONE) {
            graphemes++;
        }
        return graphemes;
    }
}
