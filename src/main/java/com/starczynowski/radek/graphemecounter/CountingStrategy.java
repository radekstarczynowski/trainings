package com.starczynowski.radek.graphemecounter;

public interface CountingStrategy {

    int length(String sequence);

    default String name() {
        return getClass().getSimpleName();
    }
}
