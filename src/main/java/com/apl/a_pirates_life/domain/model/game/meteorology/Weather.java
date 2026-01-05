package com.apl.a_pirates_life.domain.model.game.meteorology;

import lombok.Getter;

@Getter
public enum Weather {

    SUNSHINE(10),
    RAIN(10),
    CLOUDS(10),
    WIND(10),
    LIGHTNING(10),
    FOG(10),
    HAIL(10),
    SNOW(10);

    private final long length;

    Weather(long length) {
        this.length = length;
    }
}
