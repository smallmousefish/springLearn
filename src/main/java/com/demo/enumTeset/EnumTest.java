package com.demo.enumTeset;

import com.demo.enumDemo.Color;

public class EnumTest {

    private enum Holder
    {
        HOLDER,
//        private String str;
        BBB,
        AAA;
        private String str;
        private String str1;
        private String str3;
        Holder(){
            this.str = "123";
            this.str1 = "abc";
            this.str3 = "xyz";
        }

    }


    public static void main(String[] args) {
//        System.out.println(Color.BLACK.);
        System.out.println(Color.AAAA.getFFF());
//        System.out.println(Holder.HOLDER.str);
//        System.out.println(Holder.AAA.str1);
    }
}
