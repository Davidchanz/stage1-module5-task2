package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        return integers -> {
            return integers.stream().map(integer -> integer / divider).collect(Collectors.toList());
        };
        //throw new UnsupportedOperationException("You should implement this method.");
    }
}
