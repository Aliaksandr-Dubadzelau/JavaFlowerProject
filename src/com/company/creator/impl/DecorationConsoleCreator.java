package com.company.creator.impl;

import com.company.creator.DecorationCreator;
import com.company.creator.FlowerCreator;
import com.company.entity.AbstractFlower;
import com.company.entity.impl.Decoration;
import com.company.view.Printer;

import java.util.Scanner;

public class DecorationConsoleCreator implements DecorationCreator {

    private static final int MIN_BORDER = 1;
    private static final int MAX_BORDER = 6;

    private static final String SEQUINS = "Sequins";
    private static final String PEARL = "Pearl";
    private static final String BASKET = "Basket";
    private static final String TYPE = "What type of decoration do you want to add?\nSequins,Pearl,Basket";

    private static Scanner scan = new Scanner(System.in);

    @Override
    public Decoration create() {

        Decoration decoration;

        Printer.printInfo(TYPE);
        String type = scan.next();

        switch (type) {
            case SEQUINS:
                decoration = Decoration.SEQUINS;
                break;

            case PEARL:
                decoration = Decoration.PEARL;
                break;

            case BASKET:
                decoration = Decoration.BASKET;
                break;

            default:
                throw new IllegalArgumentException("Invalid value: " + type);
        }

        return decoration;
    }

}
