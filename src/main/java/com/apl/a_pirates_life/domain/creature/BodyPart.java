package com.apl.a_pirates_life.domain.creature;

import com.apl.a_pirates_life.domain.item.passiveitem.passiveitems.Garment;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
@AllArgsConstructor
public class BodyPart {

    private BodyPartName name;

    @Setter
    private Garment garment;

    private double health;
}
