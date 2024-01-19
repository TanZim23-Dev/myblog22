package com.myblog2.myblog22;

import java.util.function.Predicate;

public class TestClass2 {

    public static void main(String[] args) {
        Predicate<String> val = str->str.equals("mike");
        boolean result1 = val.test("stallin");
        boolean result2 = val.test("mike");
        System.out.println(result2);
        System.out.println(result1);

    }
}
