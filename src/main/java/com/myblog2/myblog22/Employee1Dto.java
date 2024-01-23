package com.myblog2.myblog22;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employee1Dto {

    //public static void main(String[] args) {


//        List<Employee1> emp = Arrays.asList(
//                new Employee1("mike", 30, "bangalore"),
//                new Employee1("aman", 34, "chennai"),
//                new Employee1("stallin", 45, "udupi"),
//                new Employee1("joy", 23, "kerala"));
//
//        List<Employee1> emps = emp.stream().filter(n -> n.getName().startsWith("a")).collect(Collectors.toList());
//        //System.out.println(emps);
//
//        List<Employee1> b = emp.stream().filter(m->m.getCity()!="kerala").collect(Collectors.toList());
//
//        for(Employee1 x:emps){
//            System.out.println(x.getAge());
//            System.out.println(x.getCity());
//            System.out.println(x.getName());
//        }
//        for(Employee1 c : b){
//            System.out.println(c.getName());
//            System.out.println(c.getCity());
//            System.out.println(c.getAge());
//        }

   // }

//    public static void main(String[] args) {
//        List<Integer> numbers = Arrays.asList(10,12,6,5,7,8,9);
//        List<Integer> data = numbers.stream().filter(n1 -> n1 % 2 == 0).map(n2 -> n2 * n2).collect(Collectors.toList());
//        System.out.println(data);
//    }


    public static void main(String[] args) {

        List<Employee1> emp = Arrays.asList(
                new Employee1("mike", 30, "bangalore"),
                new Employee1("aman", 34, "chennai"),
                new Employee1("stallin", 45, "chennai"),
                new Employee1("joy", 34, "kerala"));

//            Map<String, List<Employee1>> collect = emp.stream().collect(Collectors.groupingBy(e -> e.getCity()));
//            System.out.println(collect);


        Map<String, List<Employee1>> collect = emp.stream().collect(Collectors.groupingBy(e -> e.getCity()));
       // System.out.println(collect.get(34));
//        for (Employee1 employee: emp){
//            List<Employee1> e = collect.get(employee.getAge());
//            for (Employee1 x: e) {
//                System.out.println(x.getName());
//                System.out.println(x.getCity());
//                System.out.println(x.getAge());
//            }
//
//        }

        for (Map.Entry<String,List<Employee1>> entry : collect.entrySet()){

            String city = entry.getKey();
            List<Employee1>  employeeswithAge = entry.getValue();
            System.out.println("age:"+city+"-----");
            for(Employee1 e: employeeswithAge){

                System.out.println(e.getAge());
                System.out.println(e.getName());
                System.out.println(e.getCity());
            }
        }
    }
}
