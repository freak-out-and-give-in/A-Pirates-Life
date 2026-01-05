package com.apl.a_pirates_life.domain.model.tile.tiles;

import com.apl.a_pirates_life.domain.model.tile.BaseTile;
import com.apl.a_pirates_life.domain.model.tile.Feature;
import com.apl.a_pirates_life.domain.model.tile.Terrain;
import com.apl.a_pirates_life.domain.model.tile.Tile;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.awt.*;

@Slf4j
@Getter
@AllArgsConstructor
public class ChartedTile implements Tile {

    @Getter(AccessLevel.NONE)
    private BaseTile baseTile;

    private int expectedMovementResistance;

    private Terrain terrain;

    private Feature feature;

    @Override
    public Point getCoordinates() {
        return baseTile.getCoordinates();
    }
}
