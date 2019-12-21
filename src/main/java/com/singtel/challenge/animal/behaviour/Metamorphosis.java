package com.singtel.challenge.animal.behaviour;

import com.singtel.challenge.animal.insect.Butterfly;
import com.singtel.challenge.animal.insect.Catterpillar;

public class Metamorphosis {

    public Butterfly transform(Catterpillar catterpillar) {
        return new Butterfly(catterpillar);
    }

}
