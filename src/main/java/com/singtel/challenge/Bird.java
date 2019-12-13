package com.singtel.challenge;

public class Bird extends Animal implements SingBehaviour, WalkBehaviour, FlyBehaviour{

    public void sing() {
        System.out.println("I am singing");
    }

    public void walk() {
        System.out.println("I am walking");
    }

    public void fly() {
        System.out.println("I am flying");
    }
}
