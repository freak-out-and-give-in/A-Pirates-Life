package com.apl.a_pirates_life.domain.model.game;

import com.apl.a_pirates_life.domain.model.game.event.Events;
import com.apl.a_pirates_life.domain.model.game.map.Map;
import com.apl.a_pirates_life.domain.model.game.meteorology.Weather;
import com.apl.a_pirates_life.domain.model.game.season.Seasons;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.stat.Statistics;

@Slf4j
@AllArgsConstructor
public class Game {

    private Time time;

    private Seasons seasons;

    private Weather weather;

    private Events events;

    private Map map;

    private Statistics statistics;

    public void createGame() {

    }

    public void startGame() {

    }

    private void showUI() {

    }
}
