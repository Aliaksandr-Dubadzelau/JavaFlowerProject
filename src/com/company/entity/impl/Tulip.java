package com.company.entity.impl;

import com.company.entity.AbstractFlower;

public class Tulip extends AbstractFlower {

    private static final String TULIP_TYPE = "Tulip";

    {
        this.setType(TULIP_TYPE);
    }

    public Tulip(double cost, String color) {
        super(cost, color);
    }

    public Tulip(double cost, double lengthOfStem, int freshness, String color) {
        super(cost, lengthOfStem, freshness, color);
    }
}
