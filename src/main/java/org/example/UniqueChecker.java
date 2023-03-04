package org.example;

import java.util.Arrays;
import java.util.stream.Collectors;

public class UniqueChecker {
    public boolean isUnique(int[] possiblyUnique) {
        return Arrays.stream(possiblyUnique)
                .boxed()
                .collect(Collectors.toSet())
                .size() < possiblyUnique.length;
    }
}
