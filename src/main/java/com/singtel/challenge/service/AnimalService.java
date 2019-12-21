package com.singtel.challenge.service;

import com.singtel.challenge.animal.Bird;
import com.singtel.challenge.animal.Fish;

public interface AnimalService {

    Fish fetchFishByName(String name);

    Bird getBirdByName(String name);

}
