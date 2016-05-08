package com.regatta.server.core;

import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Created by Dylan on 08/05/2016.
 */
public class LambaUtils {

    public static <T> Collector<T, ?, T> singletonCollector() {
        return Collectors.collectingAndThen(
                Collectors.toList(),
                list -> {
                    if (list.size() != 1) {
                        throw new IllegalStateException();
                    }
                    return list.get(0);
                }
        );
    }

}
