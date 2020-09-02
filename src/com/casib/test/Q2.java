package com.casib.test;

/**
 * Created by dineshs on 6/2/2019.
 */
public class Q2 {

    public static void main(String[] args) {
        MyStruct st1, st2;

        st1 = new MyStruct(10);
        st2 = new MyStruct(0);

        st2 = st1;
        st2.myFiled++;

        System.out.println(st1.myFiled);
        System.out.println(st2.myFiled);
    }


}

class MyStruct {

    public int myFiled;

    public MyStruct(int num) {
        myFiled = num;
    }

}