package com.epam.mjc.generics;

import java.util.ArrayList;
import java.util.List;

public class Generics {

    //TODO: Refactor Method-1
    public List<Object> boxingMethod(String name) {
        List<Object> firstList = new ArrayList<>();
        firstList.add(name);
        List<Object> secondList = new ArrayList<>();
        secondList.add(firstList);
        return secondList;
    }

    //TODO: Refactor Method-2
    public <T> Object genericMethod(T data) {
        return data;
    }

    //TODO: Refactor Method-3
    public void  cloneMethod(List<Number> consumer, List<Integer> producer) {
        consumer.addAll(producer);
    }


}
