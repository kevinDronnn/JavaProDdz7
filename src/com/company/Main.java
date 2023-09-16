package com.company;

public class Main {

    public static void main(String[] args) {

        ArrayValueCalculator arrayValueCalculator = new ArrayValueCalculator();
        try {
            String[][] array = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}};
            System.out.println(arrayValueCalculator.doCalc(array));
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
