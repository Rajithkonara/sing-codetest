package com.singtel.challenge.animal.bird;

import com.singtel.challenge.animal.behaviour.MakeSoundBehaviour;
import com.singtel.challenge.animal.Bird;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Chicken extends Bird implements MakeSoundBehaviour {

    private String name = "Chicken";

    public void makeSound() {
        System.out.println("Cluck, cluck");
    }

    @Override
    public void fly() {
        System.out.println("Cannot fly");
    }
}
