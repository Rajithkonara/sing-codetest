package com.singtel.challenge;

import static com.singtel.challenge.AnimalCollection.count;

public class Solution {

    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();
        Chicken c = new Chicken();
        c.fly();

        Animal[] animals = new Animal[]{
                new Bird(),
                new Duck(),
                new Chicken(),
                new Rooster(),
                new Parrot(),
                new Fish(),
                new Shark(),
                new ClownFish(),
                new Dolphin(),
                new Butterfly()
        };

        count(animals);

    }
}
