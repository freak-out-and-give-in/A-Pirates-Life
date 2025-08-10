package com.apl.a_pirates_life.domain.creature.human.humans;

import com.apl.a_pirates_life.domain.action.animalaction.AnimalActions;
import com.apl.a_pirates_life.domain.action.humanaction.HumanActions;
import com.apl.a_pirates_life.domain.creature.Body;
import com.apl.a_pirates_life.domain.creature.Inventory;
import com.apl.a_pirates_life.domain.creature.Species;
import com.apl.a_pirates_life.domain.creature.Team;
import com.apl.a_pirates_life.domain.creature.human.Human;
import com.apl.a_pirates_life.domain.creature.human.BaseHuman;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
public class Player implements Human {

    private BaseHuman baseHuman;

    @Override
    public HumanActions getHumanActions() {
        return baseHuman.getHumanActions();
    }

    @Override
    public String getName() {
        return baseHuman.getName();
    }

    @Override
    public AnimalActions getAnimalActions() {
        return baseHuman.getAnimalActions();
    }

    @Override
    public boolean getAlive() {
        return baseHuman.getAlive();
    }

    @Override
    public Species getSpecies() {
        return baseHuman.getSpecies();
    }

    @Override
    public Body getBody() {
        return baseHuman.getBody();
    }

    @Override
    public double getPower() {
        return baseHuman.getPower();
    }

    @Override
    public double getWeight() {
        return baseHuman.getWeight();
    }

    @Override
    public Inventory getInventory() {
        return baseHuman.getInventory();
    }

    @Override
    public Location getLocation() {
        return baseHuman.getLocation();
    }

    @Override
    public Team getTeam() {
        return baseHuman.getTeam();
    }
}
