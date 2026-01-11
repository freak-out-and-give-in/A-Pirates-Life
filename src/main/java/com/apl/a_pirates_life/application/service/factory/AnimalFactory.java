package com.apl.a_pirates_life.application.service.factory;

import com.apl.a_pirates_life.domain.model.creature.*;
import com.apl.a_pirates_life.domain.model.creature.animal.BaseAnimal;
import com.apl.a_pirates_life.domain.model.creature.human.BaseHuman;
import com.apl.a_pirates_life.domain.model.creature.human.humans.Player;
import com.apl.a_pirates_life.domain.model.general.inventory.WeightInventory;
import com.apl.a_pirates_life.domain.model.tile.BaseTile;
import com.apl.a_pirates_life.domain.model.tile.Feature;
import com.apl.a_pirates_life.domain.model.tile.Terrain;
import com.apl.a_pirates_life.domain.model.tile.tiles.ChartedTile;
import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Slf4j
@UtilityClass
public class AnimalFactory {

    public Player makeRandomPlayer() {
        return new Player(makeBaseHuman());
    }

    private BaseHuman makeBaseHuman() {
        return new BaseHuman(makeBaseAnimal(Species.HUMAN));
    }

    private BaseAnimal makeBaseAnimal(Species species) {
        return BaseAnimal.builder()
                .name(makeRandomName())
                .alive(true)
                .species(species)
                .body(makeHumanBody())
                .power(10)
                .weight(10)
                .inventory(new WeightInventory(10.0))
                .location(makeRandomChartedTile())
                .team(new Team(makeRandomName(), null, makeRandomChartedTile()))
                .build();
    }

    private Body makeHumanBody() {
        double defaultHealth = 20;
        List<BodyPartName> humanBodyPartNames = List.of(BodyPartName.HEAD, BodyPartName.RIGHT_EYE,
                BodyPartName.LEFT_EYE, BodyPartName.TORSO, BodyPartName.RIGHT_ARM, BodyPartName.LEFT_ARM,
                BodyPartName.RIGHT_LEG, BodyPartName.LEFT_LEG);

        // Create body parts that only differ in name
        // and add them to a list
        List<BodyPart> humanBodyParts = new ArrayList<>();
        for (BodyPartName bodyPartName : humanBodyPartNames) {
            BodyPart bodyPart = new BodyPart(bodyPartName, null, defaultHealth);
            humanBodyParts.add(bodyPart);
        }

        return new Body(humanBodyParts);
    }

    private String makeRandomName() {
        return "name";
    }

    private ChartedTile makeRandomChartedTile() {
        return ChartedTile.builder()
                .baseTile(makeRandomBaseTile())
                .expectedMovementResistance(10)
                .terrain(Terrain.LAND)
                .feature(Feature.TREE)
                .build();
    }

    private BaseTile makeRandomBaseTile() {
        Random random = new Random();

        // Will generate a number between 0 and 99
        int xCoordinate = random.nextInt(100);
        int yCoordinate = random.nextInt(100);

        Point point = new Point(xCoordinate, yCoordinate);
        return new BaseTile(point);
    }
}
