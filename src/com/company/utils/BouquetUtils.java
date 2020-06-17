package com.company.utils;

import com.company.entity.AbstractFlower;
import com.company.entity.impl.Bouquet;
import com.company.entity.impl.Decoration;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BouquetUtils {

    private double getTotalFlowerPrice(List<AbstractFlower> flowers) {
        double result = 0;

        for (AbstractFlower flower : flowers) {
            result += flower.getCost();
        }

        return result;
    }

    private double getTotalDecorationPrice(List<Decoration> decorations) {
        double result = 0;

        for (Decoration decoration : decorations) {
            result += decoration.getCost();
        }

        return result;
    }

    public double getTotalPrice(List<AbstractFlower> flowers, List<Decoration> decorations) {
        return getTotalDecorationPrice(decorations) + this.getTotalFlowerPrice(flowers);
    }

    public void sortFlowers(List<AbstractFlower> flowers) {
        Collections.sort(flowers);
    }

    public List<AbstractFlower> findFlowers(Bouquet bouquet, double lengthOfStem) {

        ArrayList<AbstractFlower> flowers = new ArrayList<>();

        for (AbstractFlower flower : bouquet.getFlowers()){
            if (flower.getLengthOfStem() > lengthOfStem){
                flowers.add(flower);
            }
        }

        return flowers;
    }


}