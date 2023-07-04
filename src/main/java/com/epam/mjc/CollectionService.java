package com.epam.mjc;

import java.util.*;
import java.util.stream.Collectors;


public class CollectionService {

    public List<Integer> filterEvenNumbers(List<Integer> list) {
        List<Integer> integer = list
                .stream()
                .filter(c -> c%2==0)
                .collect(Collectors.toList());
     return integer;

    }

    public List<String> toUpperCaseCollection(List<String> list) {
        List<String> uppercaseWordList = list.stream()
                .map(value -> value.toUpperCase())
                .collect(Collectors.toList());
        return uppercaseWordList;
    }

    public Optional<Integer> findMax(List<Integer> list) {
     return list.stream()
        .max(Integer::compare);


    }

    public Optional<Integer> findMin(List<List<Integer>> list) {
        return list.stream()
                .flatMap(Collection::stream)
                .min(Integer ::compareTo);

    }

    public Integer sum(List<Integer> list) {
        return list.stream()
                .reduce(Integer::sum)
                .get();
    }
}
