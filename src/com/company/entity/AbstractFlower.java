package com.company.entity;

import com.company.creator.FlowerCreator;
import com.company.creator.impl.FlowerConsoleCreator;
import com.company.entity.impl.Bouquet;

import java.util.Objects;

public abstract class AbstractFlower implements Goods, Comparable<AbstractFlower> {

    private static final double DEFAULT_OF_STEM_LENGTH = 15;
    private static final int DEFAULT_FRESHNESS = 1;

    private double cost;
    private double lengthOfStem;
    private int freshness;
    private String color;
    private String type;

    {
        this.lengthOfStem = DEFAULT_OF_STEM_LENGTH;
        this.freshness = DEFAULT_FRESHNESS;
    }

    public AbstractFlower(double cost, String color) {
        this.color = color;
        this.cost = cost;
    }

    public AbstractFlower(double cost, double lengthOfStem, int freshness, String color) {
        this(cost, color);
        this.lengthOfStem = lengthOfStem;
        this.freshness = freshness;
    }

    public double getLengthOfStem() {
        return lengthOfStem;
    }

    public void setLengthOfStem(double lengthOfStem) {
        this.lengthOfStem = lengthOfStem;
    }

    public int getFreshness() {
        return freshness;
    }

    public void setFreshness(int freshness) {
        this.freshness = freshness;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    protected void setType(String type) {
        this.type = type;
    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractFlower that = (AbstractFlower) o;
        return Double.compare(that.getCost(), getCost()) == 0 &&
                Double.compare(that.getLengthOfStem(), getLengthOfStem()) == 0 &&
                getFreshness() == that.getFreshness() &&
                getColor().equals(that.getColor()) &&
                getType().equals(that.getType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCost(), getLengthOfStem(), getFreshness(), getColor(), getType());
    }

    @Override
    public String toString() {
        return "Flower: " +
                "cost- " + cost +
                ", lengthOfStem- " + lengthOfStem +
                ", freshness- " + freshness +
                ", color- " + color +
                ", type- " + type;
    }

    @Override
    public int compareTo(AbstractFlower o) {
        return Integer.compare(this.getFreshness(), o.getFreshness());
    }
}
