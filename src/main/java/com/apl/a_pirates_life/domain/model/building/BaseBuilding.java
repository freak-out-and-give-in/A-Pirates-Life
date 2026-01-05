package com.apl.a_pirates_life.domain.model.building;

import com.apl.a_pirates_life.domain.model.creature.Inventory;
import com.apl.a_pirates_life.domain.model.creature.animal.Animal;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
@Getter
@AllArgsConstructor
public class BaseBuilding implements Building {

    private Animal owner;

    private String name;

    private Inventory inventory;

    private List<Animal> animals;
}
