package com.singtel.challenge.utils;

public enum AnimalSounds {

    Dog("Woof, woof"),
    CAT("Meow"),
    ROOSTER("Cock-a-doodle-doo");

    private String sound;

    AnimalSounds(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }

}
