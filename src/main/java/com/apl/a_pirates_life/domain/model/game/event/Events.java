package com.apl.a_pirates_life.domain.model.game.event;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
@Getter
@AllArgsConstructor
public class Events {

    private List<Event> events;

    public void tryToStartEvent() {

    }
}
