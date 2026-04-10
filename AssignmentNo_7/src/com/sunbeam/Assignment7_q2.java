package com.sunbeam;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Assignment7_q2 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("sumit");
        list.add("pranav");
        list.add("amit");
        list.add("sandesh");

        List<String> list1 = list.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(list1);
    }
}