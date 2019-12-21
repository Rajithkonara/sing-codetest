package com.singtel.challenge.animal;

import com.singtel.challenge.animal.behaviour.SwimBehaviour;

public class Fish extends Animal implements SwimBehaviour {

    private String color;
    private String size;
    private boolean makeJokes;
    private boolean predator;

    public void canSwim() {
        System.out.println("I can swim");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public boolean isMakeJokes() {
        return makeJokes;
    }

    public void setMakeJokes(boolean makeJokes) {
        this.makeJokes = makeJokes;
    }

    public boolean isPredator() {
        return predator;
    }

    public void setPredator(boolean predator) {
        this.predator = predator;
    }
}
