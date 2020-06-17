package com.company.view;

import com.company.entity.AbstractFlower;
import com.company.entity.impl.Bouquet;

import java.util.List;

public class Printer {

    public static void printInfo(String msg){
        System.out.println(msg);
    }

    public static void printPrice(double price){
        System.out.println(price);
    }

    public static void printFlowers(List<AbstractFlower> flower){
        System.out.println(flower);
    }

    public static void printBouquet(Bouquet bouquet){
        System.out.println(bouquet);
    }
}
