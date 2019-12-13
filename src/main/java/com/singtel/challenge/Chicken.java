package com.singtel.challenge;

public class Chicken extends Bird implements MakeSoundBehaviour {

    public void makeSound() {
        System.out.println("Cluck, cluck");
    }

    @Override
    public void fly() {
        System.out.println("Cannot fly");
    }
}
