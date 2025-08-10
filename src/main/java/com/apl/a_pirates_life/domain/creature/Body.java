package com.apl.a_pirates_life.domain.creature;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
@AllArgsConstructor
public class Body {

    private BodyPart head;

    private BodyPart rightEye;

    private BodyPart leftEye;

    private BodyPart torso;

    private BodyPart rightArm;

    private BodyPart leftArm;

    private BodyPart rightLeg;

    private BodyPart leftLeg;
}
