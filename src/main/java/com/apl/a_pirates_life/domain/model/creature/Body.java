package com.apl.a_pirates_life.domain.model.creature;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
@Getter
@AllArgsConstructor
public class Body {

    private List<BodyPart> bodyParts;

    public void addGarment() {
    }

}
