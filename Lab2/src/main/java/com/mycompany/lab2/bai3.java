/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab2;

import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai3 {

    public static void main(String[] args) {
        int sodien,tien;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so dien: ");
        sodien = sc.nextInt();
        if(sodien<50){
            System.out.print("Gia tien so dien la: "+(sodien*1000));
        }else {
            System.out.println("Gia tien so dien la: "+(50*1000+(sodien-50)*1200));
        }
    }
}
