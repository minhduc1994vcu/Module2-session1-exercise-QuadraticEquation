package com.codegym;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter number a: ");
        float a = scanner.nextFloat();
        System.out.print("enter number b: ");
        float b = scanner.nextFloat();
        System.out.print("enter number c: ");
        float c = scanner.nextFloat();
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("vo so nghiem");
                } else {
                    System.out.println("vo nghiem");
                }
            } else {
                System.out.println("1 nghiem la: " + -c / b);
            }
        } else {
            float delta = b*b - 4*a*c;

            if (delta < 0) {
                System.out.println("phuong trinh vo nghiem");
            } else if (delta == 0) {
                System.out.println(" nghiem kep la: " + -b / (2 * a));
            } else {
                System.out.printf("nghiem thu 1 la %f , nghiem thu 2 la %f", (-b+Math.sqrt(delta))/(2*a),(-b-Math.sqrt(delta))/(2*a));
            }
        }



    }
}
