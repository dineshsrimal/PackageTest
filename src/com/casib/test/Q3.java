package com.casib.test;

/**
 * Created by dineshs on 6/2/2019.
 */
public class Q3 {

    public static void main(String[] args) {
        MyClass c11, c12;

        c11 = new MyClass("First Message");
        c12 = new MyClass("Second Message");

        System.out.println(c11.MyCount() + ", " + c11.myMessage);
        System.out.println(c12.MyCount() + ", " + c12.myMessage);
    }
}

class MyClass {
    public static int myCount;
    public String myMessage;

    static {
        myCount = 10;
    }

    public MyClass(String msg) {
        myMessage = msg;
        myCount++;
    }

    public int MyCount() {
        return myCount;
    }

}
