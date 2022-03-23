package com.oop;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Berat Badan (kilogram)\t: ");
        float b = sc.nextFloat();
        System.out.print("Tinggi Badan (meter)\t: ");
        float t = sc.nextFloat();
        float imt = b / t / t;
        if (imt <= 18.5) {
            System.out.printf("Index Massa Tubuh\t= %.2f%s%n ", imt, "\nKurus");
        } else if (imt > 18.5 && imt <= 25) {
            System.out.printf("Index Massa Tubuh\t= %.2f%s%n ", imt, "\nNormal");
        } else if (imt > 25 && imt <= 30) {
            System.out.printf("Index Massa Tubuh\t= %.2f%s%n ", imt, "\nGemuk");
        } else {
            System.out.printf("Index Massa Tubuh\t= %.2f%s%n ", imt, "\nKegemukan");
        }
    }
}
