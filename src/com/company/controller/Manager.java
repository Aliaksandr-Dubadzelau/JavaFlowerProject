package com.company.controller;

import com.company.creator.DecorationCreator;
import com.company.creator.FlowerCreator;
import com.company.creator.impl.DecorationConsoleCreator;
import com.company.creator.impl.FlowerConsoleCreator;
import com.company.entity.AbstractFlower;
import com.company.entity.impl.Bouquet;
import com.company.entity.impl.Decoration;
import com.company.utils.BouquetUtils;
import com.company.view.Printer;

import java.util.List;
import java.util.Scanner;


public class Manager {

    private static final String MENU_MESSAGE = "1 - Add a flower.\n" +
            "2 - Add a decoration.\n" +
            "3 - Get total price.\n" +
            "4 - Find a flower.\n" +
            "5 - Sort a bouquet.\n" +
            "6 - Exit\n\n";

    private static final String ERROR_MESSAGE = "\nSomething went wrong.\n";
    private static final String DEFAULT_MESSAGE = "\nInput length of stem: \n";

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        FlowerCreator flowerCreator = new FlowerConsoleCreator();
        DecorationCreator decorationCreator = new DecorationConsoleCreator();
        Bouquet bouquet = new Bouquet();
        BouquetUtils bouquetUtils = new BouquetUtils();

        boolean flag = true;

        while (flag) {

            Printer.printInfo(MENU_MESSAGE);

            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    addFlower(bouquet, flowerCreator);
                    break;

                case 2:
                    addDecoration(bouquet, decorationCreator);
                    break;

                case 3:
                    List<AbstractFlower> flowers = bouquet.getFlowers();
                    List<Decoration> decorations = bouquet.getDecorations();
                    double totalPrice = bouquetUtils.getTotalPrice(flowers, decorations);
                    Printer.printPrice(totalPrice);
                    break;

                case 4:
                    Printer.printInfo(DEFAULT_MESSAGE);
                    double lengthOfStem = scan.nextDouble();
                    List<AbstractFlower> suitableFlowers = bouquetUtils.findFlowers(bouquet, lengthOfStem);
                    Printer.printFlowers(suitableFlowers);
                    break;

                case 5:
                    List<AbstractFlower> sortableFlowers = bouquet.getFlowers();
                    bouquetUtils.sortFlowers(sortableFlowers);
                    Printer.printFlowers(sortableFlowers);
                    break;

                case 6:
                    flag = false;
                    break;

                default:
                    Printer.printInfo(ERROR_MESSAGE);

            }
        }
    }

    private static void addFlower(Bouquet bouquet, FlowerCreator flowerCreator){
        try {
            AbstractFlower flower = flowerCreator.create();
            bouquet.add(flower);
        } catch (IllegalArgumentException e) {
            System.err.println(ERROR_MESSAGE + e);
        }
    }

    private static void addDecoration(Bouquet bouquet, DecorationCreator decorationCreator){
        try {
            Decoration decoration = decorationCreator.create();
            bouquet.add(decoration);
        } catch (IllegalArgumentException e) {
            System.err.println(ERROR_MESSAGE + e);
        }
    }
}
