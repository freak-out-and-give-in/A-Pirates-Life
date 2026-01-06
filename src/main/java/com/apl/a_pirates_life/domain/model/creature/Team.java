package com.apl.a_pirates_life.domain.model.creature;

import com.apl.a_pirates_life.domain.model.creature.human.Human;
import com.apl.a_pirates_life.domain.model.tile.tiles.ChartedTile;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
@Getter
@AllArgsConstructor
public class Team {

    private String name;

    private List<Human> humans;

    private ChartedTile home;
}
