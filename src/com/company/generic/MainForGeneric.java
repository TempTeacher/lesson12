package com.company.generic;

import java.util.List;

public class MainForGeneric {
    public static void main(String...args) {
        KeyValuePair<String, Integer> keyValuePair = new KeyValuePair<>("example", 2);
//        KeyValuePair<Double, Double> keyValuePair1 = keyValuePair; <- error

    }

    private static void superString(List<? super String> list) {
        list.add("text1");
        String value = (String) list.get(0); //<- works with Object during reading
    }

    private static void extendsString(List<? extends String> list) {
//        list.add("text2");  <- error
        list.add(null);
        String value = list.get(0);
    }
}
