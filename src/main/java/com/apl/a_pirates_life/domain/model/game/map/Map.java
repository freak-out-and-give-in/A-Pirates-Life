package com.apl.a_pirates_life.domain.model.game.map;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
@AllArgsConstructor
public class Map {

    private Tiles tiles;

    private MapVisualiser mapVisualiser;
}
