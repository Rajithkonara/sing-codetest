package com.singtel.challenge.animal.fish;

import com.singtel.challenge.animal.Fish;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Shark extends Fish {

    private String name = "Shark";
    private String color = "Grey";
    private String size = "Large";
    private boolean predator = true;

}
