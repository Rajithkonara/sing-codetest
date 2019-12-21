package com.singtel.challenge;

public class Dolphin extends Animal implements SwimBehaviour {

    @Override
    public void canSwim() {
        System.out.println("I can swim");
    }

}
