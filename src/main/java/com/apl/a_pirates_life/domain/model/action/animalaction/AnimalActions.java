package com.apl.a_pirates_life.domain.model.action.animalaction;

import com.apl.a_pirates_life.domain.model.action.Action;
import com.apl.a_pirates_life.domain.model.action.animalaction.animalactions.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
@NoArgsConstructor
public class AnimalActions implements Action {

    private final Move move = new Move();

    private final Rest rest = new Rest();

    private final Communicate communicate = new Communicate();

    private final Search search = new Search();

    private final Fight fight = new Fight();

    private final InventoryInteraction inventoryInteraction = new InventoryInteraction();

    private final BodyInteraction bodyInteraction = new BodyInteraction();
}
