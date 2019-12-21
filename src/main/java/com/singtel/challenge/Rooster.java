package com.singtel.challenge;

import com.singtel.challenge.utils.LanguageUtil;

public class Rooster extends Chicken implements MakeSoundBehaviour {

    public void makeSound() {
        System.out.println("Cock-a-doodle-doo");
    }

    public void makeNativeSound(String language) {
        System.out.println(LanguageUtil.translate(language));
    }


}
