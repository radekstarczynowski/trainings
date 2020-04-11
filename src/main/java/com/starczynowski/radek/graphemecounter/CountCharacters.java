package com.starczynowski.radek.graphemecounter;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class CountCharacters {

    public static void main(String[] args) {
        var text = "เป็นมนุษย์สุดประเสริ";
        var counters = List.of(new LengthCountingStrategy(), new BreakIteratorCountingStrategy());
        counters.forEach(strategy -> log.info("{} -> {}", strategy.name(), strategy.length(text)));
    }
}
