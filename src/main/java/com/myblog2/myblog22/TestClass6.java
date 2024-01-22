package com.myblog2.myblog22;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class TestClass6 {

//    public static void main(String[] args) {
//        Consumer<Integer>  val = no-> System.out.println(no);
//        val.accept(100);
//
//        Consumer<String> as = v-> System.out.println(v);
//        as.accept("mike");
//
//        Consumer<Boolean> br = b-> System.out.println(b);
//        br.accept(true);
//    }

    public static void main(String[] args) {
//        List<String> list = Arrays.asList("mike", "adam", "thompson", "joy");
//        Consumer<String> val = n-> System.out.println(n);
//        list.forEach(val);


        List<String> nm = Arrays.asList("mike", "uhd", "hhbd");
        Consumer<String> val = c -> System.out.println(c);
        nm.forEach(val);

    }

}