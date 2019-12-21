package com.singtel.challenge.animal.fish;

import com.singtel.challenge.animal.Animal;
import com.singtel.challenge.animal.behaviour.SwimBehaviour;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Dolphin extends Animal implements SwimBehaviour {

    private String name = "Dolphin";

    @Override
    public void canSwim() {
        System.out.println("I can swim");
    }

}
