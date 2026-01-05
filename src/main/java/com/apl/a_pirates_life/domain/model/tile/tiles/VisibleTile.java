package com.apl.a_pirates_life.domain.model.tile.tiles;

import com.apl.a_pirates_life.domain.model.creature.Inventory;
import com.apl.a_pirates_life.domain.model.tile.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.awt.*;

@Slf4j
@Getter
@AllArgsConstructor
public class VisibleTile implements Tile {

    @Getter(AccessLevel.NONE)
    private BaseTile baseTile;

    private int movementResistance;

    private Terrain terrain;

    private Feature feature;

    private Inventory animal;

    private Inventory item;

    private Effect effect;

    @Override
    public Point getCoordinates() {
        return baseTile.getCoordinates();
    }
}
