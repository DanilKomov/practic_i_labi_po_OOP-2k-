package ru.mirea.prakt5;

public class Main {
    public static void main(String[] args) {
printToN(7);
    }

    public static void printToN(int n) {
printToN(n, n);
    }

    public static void printToN(intstartN, intcurrentN) {
System.out.println(startN - currentN + 1);
        if (currentN - 1 == 0) {
            return;
        }
printToN(startN, currentN-1);
    }
}
