package com.apl.a_pirates_life.domain.model.game.statistic;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
public enum Statistic {

    EARNED_STERLING(0, 200, "x", false),
    CAUGHT_FISH(0, 10, "Fishing", false),
    KILLED_KRAKEN(0, 1, "Attack", false);

    private final int currentAmount;

    private final int amountNeeded;

    private final String event;

    private final boolean hasTriggered;

    Statistic(int currentAmount, int amountNeeded, String event, boolean hasTriggered) {
        this.currentAmount = currentAmount;
        this.amountNeeded = amountNeeded;
        this.event = event;
        this.hasTriggered = hasTriggered;
    }
}
