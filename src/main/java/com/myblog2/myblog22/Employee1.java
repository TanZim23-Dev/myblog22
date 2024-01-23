package com.myblog2.myblog22;

public class Employee1 {

    private String name;
    private int age;
    private String city;

    public Employee1(String name,int age,String city) {
        this.name = name;
        this.age = age;
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
