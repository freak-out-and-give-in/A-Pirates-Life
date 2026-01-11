package com.apl.a_pirates_life.domain.model.action.humanaction;

import com.apl.a_pirates_life.domain.model.action.Action;
import com.apl.a_pirates_life.domain.model.action.animalaction.AnimalActions;
import com.apl.a_pirates_life.domain.model.action.humanaction.humanactions.Exchange;
import com.apl.a_pirates_life.domain.model.action.humanaction.humanactions.Fish;
import com.apl.a_pirates_life.domain.model.action.humanaction.humanactions.Sail;
import com.apl.a_pirates_life.domain.model.action.humanaction.humanactions.Work;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
@NoArgsConstructor
public class HumanActions implements Action {

    @Getter(AccessLevel.NONE)
    private final AnimalActions animalActions = new AnimalActions();

    private final Work work = new Work();

    private final Sail sail = new Sail();

    private final Exchange exchange = new Exchange();

    private final Fish fish = new Fish();
}
