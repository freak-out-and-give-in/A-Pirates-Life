package com.apl.a_pirates_life.domain.model.creature.human.humans;

import com.apl.a_pirates_life.domain.model.action.animalaction.AnimalActions;
import com.apl.a_pirates_life.domain.model.action.humanaction.HumanActions;
import com.apl.a_pirates_life.domain.model.creature.Body;
import com.apl.a_pirates_life.domain.model.creature.Inventory;
import com.apl.a_pirates_life.domain.model.creature.Species;
import com.apl.a_pirates_life.domain.model.creature.Team;
import com.apl.a_pirates_life.domain.model.creature.human.BaseHuman;
import com.apl.a_pirates_life.domain.model.creature.human.Human;
import com.apl.a_pirates_life.domain.model.tile.tiles.ChartedTile;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@AllArgsConstructor
public class NPC implements Human {

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
    public ChartedTile getLocation() {
        return baseHuman.getLocation();
    }

    @Override
    public Team getTeam() {
        return baseHuman.getTeam();
    }
}
