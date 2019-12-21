package com.singtel.challenge.animal.insect;

import com.singtel.challenge.animal.behaviour.FlyBehaviour;
import com.singtel.challenge.animal.Insect;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Butterfly extends Insect implements FlyBehaviour {

    private String name = "Butterfly";

    private Catterpillar catterpillar;

    public Butterfly(Catterpillar catterpillar) {
        this.catterpillar = catterpillar;
    }

    public Butterfly() {}

    @Override
    public void fly() {
        System.out.println("I can fly");
    }

}
