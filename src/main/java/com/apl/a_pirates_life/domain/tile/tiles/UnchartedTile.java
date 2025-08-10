package com.apl.a_pirates_life.domain.tile.tiles;

import com.apl.a_pirates_life.domain.tile.BaseTile;
import com.apl.a_pirates_life.domain.tile.Tile;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.awt.*;

@Slf4j
@AllArgsConstructor
public class UnchartedTile implements Tile {

    private BaseTile baseTile;

    @Override
    public Point getCoordinates() {
        return baseTile.getCoordinates();
    }
}
