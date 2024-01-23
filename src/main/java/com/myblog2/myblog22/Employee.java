package com.myblog2.myblog22;

public class Employee {

    private String name;
    private int age;
    private String city;

    public Employee(String name,int age,String city){
        this.age = age;
        this.name = name;
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public String getName() {
        return name;
    }
}
