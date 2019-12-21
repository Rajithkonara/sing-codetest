package com.singtel.challenge;

import com.singtel.challenge.animal.Animal;
import com.singtel.challenge.animal.Bird;
import com.singtel.challenge.animal.Fish;
import com.singtel.challenge.animal.bird.Duck;
import com.singtel.challenge.animal.bird.Rooster;
import com.singtel.challenge.animal.bird.Chicken;
import com.singtel.challenge.animal.bird.Parrot;
import com.singtel.challenge.animal.fish.ClownFish;
import com.singtel.challenge.animal.fish.Dolphin;
import com.singtel.challenge.animal.fish.Shark;
import com.singtel.challenge.animal.insect.Butterfly;

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
