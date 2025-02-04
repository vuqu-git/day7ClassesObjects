package org.example;

import java.util.Date;

public class Car {
    String brand;
    String model;
    String color;
    Date manufacturingYear;
    double speed;

    public void start() {
        System.out.println("I'm running!");
    }

    public void accelerateTo(double targetSpeed) {
        speed = targetSpeed;
    }

    public double getSpeed() {
        return speed;
    }


    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();

        Car secondCar = new Car();
        secondCar.accelerateTo(85.7);
        System.out.println("Speed of 2nd car: " + secondCar.getSpeed());
    }
}

enum Gender {
    FEMALE,
    NON_BINARY,
    MALE,
    CISGENDER,
    GENDERFLUID,
    TRANSGENDER,
    AGENDER,
    PANGENDER,
    GENDER_NEUTRAL
}

class Person {
    String name;
    int age;
    Gender gender;

    // with access modifier public but without non-access modifier static!
    public Person(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // with access modifier public but without non-access modifier static!
    @Override
    public String toString() {
        return String.format("Hello, I am %s and %d years old.", name, age);
    }

    public static void main(String[] args) {
        Person mySith = new Person("Darth Vader", 55, Gender.MALE);
        System.out.println((mySith));

        Person myJedi = new Person("Rey Palpatine", 24, Gender.FEMALE);
        System.out.println((myJedi));
    }

}