/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab2;

import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai2 {

    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap a: ");
        a = sc.nextInt();
        System.out.print("Nhap b: ");
        b = sc.nextInt();
        System.out.print("Nhap c: ");
        c = sc.nextInt();

        if (a == 0) {
            // Trường hợp phương trình bậc 1: bx + c = 0
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phuong trinh vo so nghiem.");
                } else {
                    System.out.println("Phuong trinh vo nghiem.");
                }
            } else {
                double x = - (double)c / b;
                System.out.println("Phuong trinh co nghiem: x = " + x);
            }
        } else {
            // Phương trình bậc 2: ax^2 + bx + c = 0
            double delta = b*b - 4*a*c;
            if (delta < 0) {
                System.out.println("Phuong trinh vo nghiem.");
            } else if (delta == 0) {
                double x = - (double)b / (2*a);
                System.out.println("Phuong trinh co nghiem kep: x = " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2*a);
                double x2 = (-b - Math.sqrt(delta)) / (2*a);
                System.out.println("Phuong trinh co 2 nghiem phan biet:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }
    }
}
