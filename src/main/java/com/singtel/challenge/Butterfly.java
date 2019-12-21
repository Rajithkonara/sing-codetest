package com.singtel.challenge;

public class Butterfly extends Insect implements FlyBehaviour {

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
