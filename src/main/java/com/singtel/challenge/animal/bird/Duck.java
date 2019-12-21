package com.singtel.challenge.animal.bird;

import com.singtel.challenge.animal.behaviour.MakeSoundBehaviour;
import com.singtel.challenge.animal.Bird;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Duck extends Bird implements MakeSoundBehaviour {

    private String name = "Duck";

    public void swim() {
        System.out.println("I can swim");
    }

    public void makeSound() {
        System.out.println("Quack, quack");
    }
}
