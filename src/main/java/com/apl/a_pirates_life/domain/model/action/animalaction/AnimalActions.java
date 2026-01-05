package com.apl.a_pirates_life.domain.model.action.animalaction;

import com.apl.a_pirates_life.domain.model.action.Action;
import com.apl.a_pirates_life.domain.model.action.animalaction.animalactions.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
@AllArgsConstructor
public class AnimalActions implements Action {

    private Move move;

    private Rest rest;

    private Communicate communicate;

    private Search search;

    private Fight fight;

    private InventoryInteraction inventoryInteraction;

    private BodyInteraction bodyInteraction;
}
