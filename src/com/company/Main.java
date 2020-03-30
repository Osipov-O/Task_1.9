package com.company;

public class Main {

    public static void main(String[] args) {
	    double x1 = 1;
        double y1 = 2;

        double x2 = 6;
        double y2 = 4;

        double x3 = 16;
        double y3 = 8;

        double proekt_x1 = Math.abs(x2 - x1); // Проекция 1го вектора на ось Х
        double proekt_y1 = Math.abs(y2 - y1); // Проекция 1го вектора на ось Y

        double proekt_x2 = Math.abs(x3 - x2); // Проекция 2го вектора на ось Х
        double proekt_y2 = Math.abs(y3 - y2); // Проекция 2го вектора на ось Y

        if (proekt_x1/proekt_y1 == proekt_x2/proekt_y2){
            System.out.println("Точки лежат на общей прямой");
        }
        else System.out.println("Точки не лежат на общей прямой");
    }
}
