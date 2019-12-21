package com.singtel.challenge.animal;

import com.singtel.challenge.animal.behaviour.FlyBehaviour;
import com.singtel.challenge.animal.behaviour.SingBehaviour;
import com.singtel.challenge.animal.behaviour.WalkBehaviour;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Bird extends Animal implements SingBehaviour, WalkBehaviour, FlyBehaviour {

    private String name = "Bird";

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
