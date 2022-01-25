package com.company.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MainForList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("t");
        list.add("e");
        List<String> linkedList = new LinkedList<>();
        linkedList.add("3");
        linkedList.add("4");
        list.addAll(linkedList);
        // or
        Collections.addAll(list, "y", "i", "p", "w");  // or
        Collections.addAll(linkedList, new String[] {"2", "4"});
        linkedList.sort(Comparator.naturalOrder());
        // or
        Collections.sort(list);

    }

    private static void wrongIteration(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    private static void correctIteration1(List<Integer> list) {
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }

    private static void correctIteration2(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    private static void correctIteration3(ArrayList<Integer> list) {
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }

    private static void correctIteration4(LinkedList<Integer> list) {
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }

    private static void correctIteration5(List<Integer> list) {
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}


