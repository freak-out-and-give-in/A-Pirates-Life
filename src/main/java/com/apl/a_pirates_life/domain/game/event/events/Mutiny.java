package com.apl.a_pirates_life.domain.game.event.events;

import com.apl.a_pirates_life.domain.creature.animal.Animal;
import com.apl.a_pirates_life.domain.game.event.BaseEvent;
import com.apl.a_pirates_life.domain.game.event.Event;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
@AllArgsConstructor
public class Mutiny implements Event {

    private BaseEvent baseEvent;

    @Override
    public String getName() {
        return baseEvent.getName();
    }

    @Override
    public List<Animal> getAnimals() {
        return baseEvent.getAnimals();
    }
}
