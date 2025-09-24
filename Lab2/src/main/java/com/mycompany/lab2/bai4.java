package com.mycompany.lab2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        int cn = 0;

        do {
            System.out.println("\n===== DANH SACH CHUC NANG =====");
            System.out.println("1: Giai phuong trinh bac 1");
            System.out.println("2: Giai phuong trinh bac 2");
            System.out.println("3: Tinh tien dien");
            System.out.println("4: Ket thuc");
            System.out.print("Chon chuc nang: ");

            try {
                cn = sc.nextInt(); // nhập số
                switch (cn) {
                    case 1:
                        System.out.println("Ban da chon: giai phuong trinh bac 1");
                        bai1.main(new String[] {});
                        break;
                    case 2:
                        System.out.println("Ban da chon: giai phuong trinh bac 2");
                        bai2.main(new String[] {});
                        break;
                    case 3:
                        System.out.println("Ban da chon: tinh tien dien");
                        bai3.main(new String[] {});
                        break;
                    case 4:
                        System.out.println("Ket thuc chuong trinh.");
                        break;
                    default:
                        System.out.println("Lua chon khong hop le, vui long nhap lai!");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Loi: vui long nhap so nguyen!");
                sc.nextLine(); // xóa dữ liệu sai để tránh lặp vô hạn
            }

        } while (cn != 4);

        sc.close();
    }
}
