package com.apl.a_pirates_life.domain.model.item;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
@AllArgsConstructor
public class BaseItem implements Item {

    private String name;

    private double weight;

    private double value;
}
