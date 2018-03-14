package com.alineselle;

class Car {

    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public String startEngine() {

        return "Car --> starts engine()";
    }

    public String brake() {

        return "Car --> brake()";
    }

    public String accelerate() {
        return "Car --> accelerate()";
    }

}

class Mitsubishi extends Car {

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Mitsubishi --> starts engine()";
    }

    @Override
    public String brake() {
        return "Mitsubishi --> breake()";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi --> accelerate()";
    }
}

class Ford extends Car {

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Ford --> starts engine()";
    }

    @Override
    public String brake() {
        return "Ford --> brake()";
    }

    @Override
    public String accelerate() {
        return "Ford --> accelerate()";
    }
}

class Holden extends Car {

    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName()+ " --> starts engine()";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName()+"--> brake()";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName()+"--> accelerate()";
    }
}

public class Main {

    public static void main(String[] args) {
        // write your code here
        Car car = new Car(8, "Base Car");
        System.out.println(car.accelerate());
        System.out.println(car.startEngine());
        System.out.println(car.brake());

        Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());
        System.out.println(mitsubishi.startEngine());

       Ford ford = new Ford(6, "Ford Falcon");
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());
        System.out.println(ford.startEngine());

         Holden holden = new Holden(6, "Holden Comodore");
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());
        System.out.println(holden.startEngine());


    }
}











































































































