package com.casib.test;

/**
 * Created by dineshs on 6/2/2019.
 */
public class Q4 {
}


class Manager implements IPerson{  // if Manager is and interface and extends IPerson then no need to implement the method
    private String firstName, lastName;

    public Manager(String fName, String lName) {
        firstName = fName;
        lastName = lName;
    }


    @Override
    public String fullName() {  // missing this method overriding
        return firstName + lastName;
    }
}


interface IPerson{
    String fullName();
}
