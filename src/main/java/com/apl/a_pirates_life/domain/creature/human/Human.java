package com.apl.a_pirates_life.domain.creature.human;

import com.apl.a_pirates_life.domain.action.humanaction.HumanActions;
import com.apl.a_pirates_life.domain.creature.animal.Animal;

public interface Human extends Animal {

    HumanActions getHumanActions();
}
