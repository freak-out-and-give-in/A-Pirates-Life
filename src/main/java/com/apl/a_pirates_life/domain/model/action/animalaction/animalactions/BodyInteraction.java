package com.apl.a_pirates_life.domain.model.action.animalaction.animalactions;

import com.apl.a_pirates_life.domain.model.creature.BodyPart;
import com.apl.a_pirates_life.domain.model.item.passiveitem.passiveitems.Garment;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BodyInteraction {

    public void changeClothes(Garment garment, BodyPart bodyPart) {
    }

    public double viewHealth(Garment garment) {
        return 0;
    }

    public double viewHealth(BodyPart bodyPart) {
        return 0;
    }
}
