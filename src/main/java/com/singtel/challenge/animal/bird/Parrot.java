package com.singtel.challenge.animal.bird;

import com.singtel.challenge.animal.Bird;
import com.singtel.challenge.utils.AnimalSounds;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Parrot extends Bird {

    private String name = "Parrot";

    public void getParrotSound(AnimalSounds animalSounds) {
        System.out.println(animalSounds.getSound());
    }

}
