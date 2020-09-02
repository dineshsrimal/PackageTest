package com.casib.test;

/**
 * Created by dineshs on 6/2/2019.
 */
public class Q1 {

    public static void main(String[] args) {
        MyCLass st1, st2;

        st1 = new MyCLass();
        st1.myFiled = 10;

        st2 = st1;
        st2.myFiled++;

        System.out.println(st1.myFiled);
        System.out.println(st2.myFiled);
    }
}

class MyCLass {

    public int myFiled;

    public MyCLass() {
        myFiled = 0;
    }

}