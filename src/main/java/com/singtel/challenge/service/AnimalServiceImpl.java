package com.singtel.challenge.service;

import com.singtel.challenge.animal.Bird;
import com.singtel.challenge.animal.Fish;
import com.singtel.challenge.animal.factory.BirdFactory;
import com.singtel.challenge.animal.factory.FishFactory;
import org.springframework.stereotype.Service;

@Service
public class AnimalServiceImpl implements AnimalService {

    @Override
    public Fish fetchFishByName(String name) {

        return FishFactory.getFish(name);

    }

    @Override
    public Bird getBirdByName(String name) {
        return BirdFactory.getBird(name);
    }

}
