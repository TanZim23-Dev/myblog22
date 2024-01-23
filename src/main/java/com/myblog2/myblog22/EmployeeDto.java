package com.myblog2.myblog22;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class EmployeeDto {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("mike",30,"chennai"),
                new Employee("adam",25,"chennai"),
                new Employee("stallin",31,"pune"),
                new Employee("sam",34,"bangalore"));

        List<Employee> emps = employees.stream().filter(emp -> emp.getAge() > 30).collect(Collectors.toList());

        for(Employee  e: emps){
            System.out.println(e.getName());
            System.out.println(e.getAge());
            System.out.println(e.getCity());
        }


    }

}
