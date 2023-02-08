package com.zegocloud.uikit.pluin.adapter.utils;

import androidx.arch.core.util.Function;
import androidx.core.util.Predicate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class GenericUtils {

    public static <T, R> List<R> map(Collection<T> list, Function<T, R> function) {
        List<R> result = new ArrayList<>();
        for (T t : list) {
            R apply = function.apply(t);
            if (apply != null) {
                result.add(apply);
            }
        }
        return result;
    }

    /**
     * filter list ,keep elements who's predicate.test is true
     *
     * @param list
     * @param predicate
     * @param <T>
     * @return
     */
    public static <T> List<T> filter(Collection<T> list, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for (T t : list) {
            boolean test = predicate.test(t);
            if (test) {
                result.add(t);
            }
        }
        return result;
    }

    public static <T> List<T> removeIf(Collection<T> list, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for (T t : list) {
            boolean test = predicate.test(t);
            if (!test) {
                result.add(t);
            }
        }
        return result;
    }
}
