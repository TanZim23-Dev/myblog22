package com.myblog2.myblog22;

public class ExampleDebuggingClass {

    public static void main(String[] args) {
        ExampleDebuggingClass t = new ExampleDebuggingClass();
        System.out.println(100);
        System.out.println(200);
        int y = t.test();
        System.out.println(y);
    }
    public int test(){

        int otp = SampleTest.test1();
        return otp;
    }
}
