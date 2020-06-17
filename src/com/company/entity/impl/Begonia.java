package com.company.entity.impl;

import com.company.entity.AbstractFlower;

public class Begonia extends AbstractFlower {

    private static final String BEGONIA_TYPE = "Begonia";

    private int amountOfBlossoms;

    {
        this.setType(BEGONIA_TYPE);
    }

    public Begonia(double cost, String color, int amountOfBlossoms) {
        super(cost, color);
        this.amountOfBlossoms = amountOfBlossoms;
    }

    public Begonia(double cost, double lengthOfStem, int freshness, String color, int amountOfBlossoms) {
        super(cost, lengthOfStem, freshness, color);
        this.amountOfBlossoms = amountOfBlossoms;
    }


}
