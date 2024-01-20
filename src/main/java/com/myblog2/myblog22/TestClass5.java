package com.myblog2.myblog22;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TestClass5 {


//    public static void main(String[] args) {
//
//        Function<String,Integer> result = str->str.length();
//        Integer val = result.apply("mike");
//        System.out.println(val);
//
//    }

//    public static void main(String[] args) {
//
//       Function<Integer,Integer> res = i->i+10;
//        Integer val = res.apply(30);
//        System.out.println(val);
//
//    }

//    public static void main(String[] args) {
//        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50, 60);
//        List<Integer> collect = list.stream().map(i -> i + 10).collect(Collectors.toList());
//        System.out.println(collect);
//
//    }

//    public static void main(String[] args) {
//        List<String> res = Arrays.asList("mike", "thompson", "jack", "smith");
//        List<String> ucase = res.stream().map(i -> i.toUpperCase()).collect(Collectors.toList());
//        System.out.println(ucase);
//        List<String> lcase = res.stream().map(n -> n.toLowerCase()).collect(Collectors.toList());
//        System.out.println(lcase);
//
//
//    }

//    public static void main(String[] args) {
//        List<String> list = Arrays.asList("mike", "stallin", "jack", "aj", "ar");
//        List<String> sortedNos = list.stream().sorted().collect(Collectors.toList());
//        System.out.println(sortedNos);
//
//
//    }

//    public static void main(String[] args) {
//        List<Integer> list = Arrays.asList(5, 67, 34, 27, 90, 45, 1);
//        List<Integer> collect = list.stream().sorted().collect(Collectors.toList());
//        System.out.println(collect);
//
//
//    }


//    public static void main(String[] args) {
//        Predicate<String> val = str->str.isEmpty();
//        boolean test = val.test("");
//        System.out.println(test);
//        boolean test1 = val.test("mike");
//        System.out.println(test1);
//
//    }


    public static void main(String[] args) {
       Predicate<Integer> isPositive = n->n>0;
       Predicate<Integer> isEven = m->m%2==0;
       Predicate<Integer> isPositiveAndisEven = isPositive.and(isEven);

        System.out.println(isPositive.test(-2));
        System.out.println(isPositive.test(2));
        System.out.println(isEven.test(3));
        System.out.println(isEven.test(4));

    }
}
