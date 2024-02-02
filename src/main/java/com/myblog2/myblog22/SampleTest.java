package com.myblog2.myblog22;

public class SampleTest {
    public static int test1() {
        SampleTest s = new SampleTest();
        int otp = s.returnOtp();
        return otp;
    }

    public int returnOtp(){
        return 123456;
    }
}
