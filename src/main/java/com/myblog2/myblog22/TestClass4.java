package com.myblog2.myblog22;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestClass4 {

    public static void main(String[] args) {

        List<String> name = Arrays.asList("mike", "adam", "mike", "stallin");
        List<String> data = name.stream().filter(n -> n.startsWith("m")).collect(Collectors.toList());
        System.out.println(data);
        List<String> data2 = name.stream().filter(m -> m.equals("mike")).collect(Collectors.toList());
        System.out.println(data2);
        List<String> data3 = name.stream().filter(o -> o.endsWith("n")).collect(Collectors.toList());
        System.out.println(data3);


    }
}
