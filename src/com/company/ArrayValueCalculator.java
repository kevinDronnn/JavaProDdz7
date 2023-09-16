package com.company;


public class ArrayValueCalculator {
    public int doCalc(String[][] array) {

        if (array[0].length != 4 || array[1].length != 4) {
            throw new ArrayIndexOutOfBoundsException("Размер массива не подходит, должен быть 4х4");
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (IllegalArgumentException e) {
                    throw new NumberFormatException("Ошибка возникла по индексу i=" + i + " j=" + j);
                }
            }
        }
        return sum;
    }
}