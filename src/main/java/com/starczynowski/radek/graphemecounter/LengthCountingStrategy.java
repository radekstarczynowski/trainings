package com.starczynowski.radek.graphemecounter;

public class LengthCountingStrategy implements CountingStrategy {

    @Override
    public int length(String sequence) {
        return sequence.length();
    }
}
