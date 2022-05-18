package com.company;

import Classes.*;

public class Main {

    /**
     * 19. Создать класс квадрат, член класса – длина стороны. Предусмотреть в классе методы
     * вычисления и вывода сведений о фигуре – диагональ, периметр, площадь. Создать производный класс
     * – правильная пирамида с апофемой (апофема – высота какой-либо боковой стороны) А, добавить в
     * класс метод определения объема фигуры, перегрузить методы расчета площади и вывода сведений о
     * фигуре. Написать программу, демонстрирующую работу с этими классами: дано N квадратов и M
     * пирамид, найти среднюю площадь квадратов и пирамиду с минимальной площадью.
     * @param args
     */
    public static void main(String[] args) {
        final int N = 50;
        final int M = 50;

        SquaresList squaresList = new SquaresList();
        PyramidsList pyramidsList = new PyramidsList();
        for (int i = 0; i < N; i++) {
            squaresList.add(new Square((int) (Math.random() * 20 + 1)));
        }
        for (int i = 0; i < M; i++) {
            pyramidsList.add(new Pyramid((int) (Math.random() * 20 + 1), (int) (Math.random() * 20 + 1)));
        }
        System.out.println(squaresList);
        System.out.println("AvgS = " + squaresList.getAvgS());
        System.out.println("-----------------------------------");
        System.out.println(pyramidsList);
        System.out.println("Min S Pyramid: " + pyramidsList.getMinSquare());

    }
}
