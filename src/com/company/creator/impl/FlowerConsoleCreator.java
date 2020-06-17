package com.company.creator.impl;

import com.company.entity.AbstractFlower;
import com.company.entity.impl.Begonia;
import com.company.entity.impl.Rose;
import com.company.entity.impl.Tulip;
import com.company.creator.FlowerCreator;
import com.company.view.Printer;

import java.util.Scanner;

public class FlowerConsoleCreator implements FlowerCreator {

    private static final int MIN_BORDER = 1;
    private static final int MAX_BORDER = 6;

    private static final String ROSE = "Rose";
    private static final String TULIP = "Tulip";
    private static final String BEGONIA = "Begonia";
    private static final String AMOUNT_OF_BLOSSOMS = "How many blossoms on a begonia?";
    private static final String AMOUNT_OF_SPIKES = "How many spikes on a rose?";
    private static final String TYPE = "What type of flower do you want to add?\nTulip,Rose,Begonia";
    private static final String COLOR = "What color do you prefer?\n";
    private static final String LENGTH_OF_STEM = "What stem length do you want?\n";
    private static final double ROSE_WOST = 5.99;
    private static final double TULIP_WOST = 4.99;
    private static final double BEGONIA_WOST = 6.49;

    private static Scanner scan = new Scanner(System.in);

    @Override
    public AbstractFlower create() {

        AbstractFlower flower;

        Printer.printInfo(TYPE);
        String type = scan.next();

        switch (type) {
            case ROSE:
                flower = createRose();
                break;

            case TULIP:
                flower = createTulip();
                break;

            case BEGONIA:
                flower = createBegonia();
                break;

            default:
                throw new IllegalArgumentException("Invalid value: " + type);
        }

        return flower;
    }

    private Rose createRose() {
        return new Rose(ROSE_WOST, enterLengthOfStem(), generateFreshness(), enterColor(), enterAmountOfSpikes());
    }

    private Tulip createTulip() {
        return new Tulip(TULIP_WOST, enterLengthOfStem(), generateFreshness(), enterColor());
    }

    private Begonia createBegonia() {
        return new Begonia(BEGONIA_WOST, enterLengthOfStem(), generateFreshness(), enterColor(), enterAmountOFBlossoms());
    }

    private int enterAmountOFBlossoms() {
        Printer.printInfo(AMOUNT_OF_BLOSSOMS);
        return scan.nextInt();
    }

    private int enterAmountOfSpikes() {
        Printer.printInfo(AMOUNT_OF_SPIKES);
        return scan.nextInt();
    }

    private String enterColor() {
        Printer.printInfo(COLOR);
        return scan.next();
    }

    private double enterLengthOfStem() {
        Printer.printInfo(LENGTH_OF_STEM);
        return scan.nextDouble();
    }

    private int generateFreshness() {
        return (int) (Math.random() * ((MAX_BORDER - MIN_BORDER) + 1)) + MIN_BORDER;
    }
}
