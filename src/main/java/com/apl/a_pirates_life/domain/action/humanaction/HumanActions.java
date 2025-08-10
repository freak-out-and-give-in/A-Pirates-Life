package com.apl.a_pirates_life.domain.action.humanaction;

import com.apl.a_pirates_life.domain.action.Action;
import com.apl.a_pirates_life.domain.action.animalaction.AnimalActions;
import com.apl.a_pirates_life.domain.action.humanaction.humanactions.Exchange;
import com.apl.a_pirates_life.domain.action.humanaction.humanactions.Sail;
import com.apl.a_pirates_life.domain.action.humanaction.humanactions.Work;
import com.apl.a_pirates_life.domain.creature.animal.animals.Fish;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
@AllArgsConstructor
public class HumanActions implements Action {

    @Getter(AccessLevel.NONE)
    private AnimalActions animalActions;

    private Work work;

    private Sail sail;

    private Exchange exchange;

    private Fish fish;
}
