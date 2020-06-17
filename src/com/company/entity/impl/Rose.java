package com.company.entity.impl;

import com.company.entity.AbstractFlower;

public class Rose extends AbstractFlower {

    private static final String ROSE_TYPE = "Rose";

    private int amountOfSpikes;

    {
        this.setType(ROSE_TYPE);
    }

    public Rose(double cost, String color, int amountOfSpikes) {
        super(cost, color);
        this.amountOfSpikes = amountOfSpikes;

    }

    public Rose(double cost, double lengthOfStem, int freshness, String color, int amountOfSpikes) {
        super(cost, lengthOfStem, freshness, color);
        this.amountOfSpikes = amountOfSpikes;
    }
}
