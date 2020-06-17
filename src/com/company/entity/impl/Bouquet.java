package com.company.entity.impl;

import com.company.entity.AbstractFlower;

import java.util.*;

public class Bouquet{

    private List<AbstractFlower> flowers = new ArrayList<>();
    private List<Decoration> decorations = new ArrayList<>();

    public Bouquet() {

            decorations.add(Decoration.STANDARD_WRAPPER);

    }

    public void add(AbstractFlower flower){
        flowers.add(flower);
    }

    public void add(Decoration decoration){
        decorations.add(decoration);
    }

    public List<AbstractFlower> getFlowers() {
        return flowers;
    }

    public void setFlowers(ArrayList<AbstractFlower> flowers) {
        this.flowers = flowers;
    }

    public List<Decoration> getDecorations() {
        return decorations;
    }

    public void setDecorations(ArrayList<Decoration> decorations) {
        this.decorations = decorations;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bouquet bouquet = (Bouquet) o;
        return getFlowers().equals(bouquet.getFlowers()) &&
                getDecorations().equals(bouquet.getDecorations());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFlowers(), getDecorations());
    }

    @Override
    public String toString() {
        return "Bouquet: " +
                "flowers- " + flowers +
                ", decorations- " + decorations +
                '}';
    }

}
