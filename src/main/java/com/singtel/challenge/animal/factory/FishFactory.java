package com.singtel.challenge.animal.factory;

import com.singtel.challenge.animal.Fish;
import com.singtel.challenge.animal.fish.ClownFish;
import com.singtel.challenge.animal.fish.Dolphin;
import com.singtel.challenge.animal.fish.Shark;

public class FishFactory {

    public static Fish getFish(String name) {

        if (name.equalsIgnoreCase("Shark")) {
            return new Shark();
        } else if (name.equalsIgnoreCase("ClownFish")) {
            return new ClownFish();
        } else {
            return null;
        }
    }
}
