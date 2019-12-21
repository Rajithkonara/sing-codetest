package com.singtel.challenge.animal.factory;

import com.singtel.challenge.animal.Bird;
import com.singtel.challenge.animal.bird.Chicken;
import com.singtel.challenge.animal.bird.Duck;
import com.singtel.challenge.animal.bird.Parrot;
import com.singtel.challenge.animal.bird.Rooster;

public class BirdFactory {

    private BirdFactory() {
    }

    public static Bird getBird(String name) {

        if (name.equalsIgnoreCase("Chicken")) {
            return new Chicken();
        } else if (name.equalsIgnoreCase("Duck")) {
            return new Duck();
        } else if (name.equalsIgnoreCase("Parrot")) {
            return new Parrot();
        } else if (name.equalsIgnoreCase("Rooster")) {
            return new Rooster();
        } else {
            return null;
        }

    }

}

