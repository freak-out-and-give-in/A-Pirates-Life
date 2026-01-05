package com.apl.a_pirates_life.domain.model.tile;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.awt.*;

@Slf4j
@Getter
@AllArgsConstructor
public class BaseTile implements Tile {

    private Point coordinates;
}
