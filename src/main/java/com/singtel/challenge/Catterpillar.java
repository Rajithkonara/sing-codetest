package com.singtel.challenge;

public class Catterpillar extends Insect implements WalkBehaviour {

    @Override
    public void walk() {
        System.out.println("I am crawl");
    }

}
