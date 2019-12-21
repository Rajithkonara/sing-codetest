package com.singtel.challenge;

import com.singtel.challenge.animal.Animal;
import com.singtel.challenge.animal.behaviour.FlyBehaviour;
import com.singtel.challenge.animal.behaviour.SingBehaviour;
import com.singtel.challenge.animal.behaviour.SwimBehaviour;
import com.singtel.challenge.animal.behaviour.WalkBehaviour;

public class AnimalCollection {

    public static void count(Animal[] animals) {

        int flyCount = 0;
        int walkCount = 0;
        int singCount = 0;
        int swimCount = 0;

        for (Animal animal : animals) {
            if (animal instanceof FlyBehaviour) {
                flyCount += 1;
            }
            if (animal instanceof WalkBehaviour) {
                walkCount += 1;
            }
            if (animal instanceof SingBehaviour) {
                singCount += 1;
            }
            if (animal instanceof SwimBehaviour) {
                swimCount += 1;
            }
        }

        System.out.println(flyCount);
        System.out.println(walkCount);
        System.out.println(singCount);
        System.out.println(swimCount);
    }


}
