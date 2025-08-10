package com.apl.a_pirates_life.domain.building;

import com.apl.a_pirates_life.domain.creature.animal.Animal;
import com.apl.a_pirates_life.domain.creature.Inventory;
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
