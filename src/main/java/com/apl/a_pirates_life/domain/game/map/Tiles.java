package com.apl.a_pirates_life.domain.game.map;

import com.apl.a_pirates_life.domain.tile.tiles.ChartedTile;
import com.apl.a_pirates_life.domain.tile.tiles.UnchartedTile;
import com.apl.a_pirates_life.domain.tile.tiles.VisibleTile;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
@Getter
@AllArgsConstructor
public class Tiles {

    private ProceduralGeneration proceduralGeneration;

    private List<VisibleTile> visibleTiles;

    private List<ChartedTile> chartedTiles;

    private List<UnchartedTile> unchartedTiles;

    public void initialiseTiles() {}
}
