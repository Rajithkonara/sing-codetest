package com.singtel.challenge.animal.fish;

import com.singtel.challenge.animal.Fish;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ClownFish extends Fish {

    private String name = "ClownFish";
    private String color = "Orange";
    private String size = "Small";
    private boolean makeJokes = true;

}
