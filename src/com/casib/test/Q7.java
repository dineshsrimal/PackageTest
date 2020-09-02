package com.casib.test;

/**
 * Created by dineshs on 6/2/2019.
 */
public class Q7 {

    public static void main(String[] args) {
        Transportation<Boat> v1 = new Transportation<Boat>(new Boat(), "SeaPrincess");
        Transportation<Plane> v2 = new Transportation<Plane>(new Plane(), "AirKing");

        System.out.println(v1.Name());
        System.out.println(v2.Name());

        if (v1.Name().equalsIgnoreCase(v2.Name())) {
            System.out.println("It is a same vehicle");
        }

    }
}

class Transportation<T extends Vehicle> {

    private T vehicle;

    public Transportation(T t, String name) {
        vehicle = t;
        vehicle.name = name;
    }

    public String Name() {
        return vehicle.name;
    }
}

class Vehicle{
    public String name;
}

class Boat extends Vehicle{

    public Boat() {

    }
}

class Plane extends Vehicle{

    public Plane() {

    }
}