package com.singtel.challenge.animal.insect;

import com.singtel.challenge.animal.Insect;
import com.singtel.challenge.animal.behaviour.WalkBehaviour;

public class Catterpillar extends Insect implements WalkBehaviour {

    private String name = "Catterpillar";

    @Override
    public void walk() {
        System.out.println("I am crawl");
    }

}
