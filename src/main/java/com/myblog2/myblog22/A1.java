package com.myblog2.myblog22;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class A1 {

    public static void main(String[] args) {


//        for (int i=0;i<5;i++){
//            System.out.println(i);
//        }

        List<Integer> list = Arrays.asList(10, 20,32,20, 32, 56, 21, 54, 89, 54, 65);
        List<Integer> collect = list.stream().distinct().collect(Collectors.toList());
        System.out.println(collect);
        System.out.println("hello");
        System.out.println(1);


    }
}
