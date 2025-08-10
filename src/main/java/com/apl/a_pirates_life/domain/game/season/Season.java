package com.apl.a_pirates_life.domain.game.season;

import lombok.Getter;

@Getter
public enum Season {

    Winter(30),
    AUTUMN(30),
    SPRING(30),
    SUMMER(30);

    private final long length;

    Season(long length) {
        this.length = length;
    }

}
