/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab2;

import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai1 {

    public static void main(String[] args) {
       //giải phương trình bậc 1
        int a,b;
    Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        a=sc.nextInt();
        System.out.print("Nhap b: ");
        b=sc.nextInt();
        if(a!=0){
            System.out.print("Co nghiem %d: "+(-b/a));
        }else{
            if(b==0){
                System.out.print("Phuong trinh co vo so nghiem");
            }else{
                System.out.print("Vo nghiem");
            }
        }
    }
}
