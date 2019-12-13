package com.singtel.challenge;

public class Duck extends Bird implements MakeSoundBehaviour {

    public void swim() {
        System.out.println("I can swim");
    }

    public void makeSound() {
        System.out.println("Quack, quack");
    }
}
