package ru.mirea.komov;
import java.util.Scanner;
public class Lab1 {
    public static void main(String[] args) {
        int Sum = 0;
        Scanner s = new Scanner(System.in);
        int[]a= new int[10];
        int i=0;
        System.out.println("Введите элементы массива");
        while ( i < 10) {
            a[i]=s.nextInt();
            Sum=Sum+a[i];
            i++;
        }
        System.out.println("Сумма ="+Sum);
    }
}
