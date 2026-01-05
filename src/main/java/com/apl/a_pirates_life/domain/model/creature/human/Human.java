package com.apl.a_pirates_life.domain.model.creature.human;

import com.apl.a_pirates_life.domain.model.action.humanaction.HumanActions;
import com.apl.a_pirates_life.domain.model.creature.animal.Animal;

public interface Human extends Animal {

    HumanActions getHumanActions();
}
