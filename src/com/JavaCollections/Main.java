package com.JavaCollections;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> iList = new ArrayList<Integer>();
        iList.add(1);
        iList.add(2);
        iList.add(3);

        iList.remove(2);
        System.out.println(iList);

        List<String> sList = new ArrayList<String>();
        sList.add("Linda");
        sList.add("Elizabeth");
        sList.add("Fibia");

        sList.remove(2);
        System.out.println(sList);

    }
}
