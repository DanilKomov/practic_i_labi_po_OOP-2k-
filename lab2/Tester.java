package ru.mirea.komov.lab2;

import java.lang.*;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        double r;
        Circle k1 = new Circle();
        k1.setX(0.5);
        k1.setY(0.6);
        k1.setY(35);
        Scanner source = new Scanner(System.in);
        System.out.println("Введите радиус ");
        r= source.nextDouble();
        k1.setR(r);;
        System.out.println("\nДлинна окружности = " +k1.getLenght() + "см\n");
    }
}
