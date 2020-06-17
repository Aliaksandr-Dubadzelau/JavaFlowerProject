package com.company.entity.impl;

public enum Decoration{
    SEQUINS(29.99), PEARL(199.99), BASKET(39.99), STANDARD_WRAPPER(19.99);

    private double cost;

    Decoration(double cost){
        this.cost = cost;
    }

    public void setCost(double cost) {

    }

    public double getCost(){
        return cost;
    }

    @Override
    public String toString() {
        return "Decoration: " +
                "cost - " + cost;
    }
}
