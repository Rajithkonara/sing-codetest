package com.singtel.challenge.animal.bird;

import com.singtel.challenge.animal.behaviour.MakeSoundBehaviour;
import com.singtel.challenge.utils.LanguageUtil;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Rooster extends Chicken implements MakeSoundBehaviour {

    private String name = "Rooster";

    public void makeSound() {
        System.out.println("Cock-a-doodle-doo");
    }

    public void makeNativeSound(String language) {
        System.out.println(LanguageUtil.translate(language));
    }


}
