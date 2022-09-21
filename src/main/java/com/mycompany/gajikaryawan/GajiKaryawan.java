/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.gajikaryawan;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class GajiKaryawan {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // currency = eth
        double salary = 0;

        double staff = 0.01;
        double PA = 0.1;
        double CEO = 3.0;

        double child1 = 0.01;
        double child2 = 0.015;
        double child3_ = 0.03;

        double wife1 = 0.02;
        double wife2_ = -0.04;

        double bachelor = 0.017;
        double magister = 0.125;

        System.out.println("---------------------------------------");
        System.out.println("|                                     |");
        System.out.println("|   Sistem Penghitungan Gaji          |");
        System.out.println("|   PT BASEMENT 1                     |");
        System.out.println("|                                     |");
        System.out.println("|-------------------------------------|");
        System.out.println("| Roles:                              |");
        System.out.println("| 1. Staff                = 0.01 eth  |");
        System.out.println("| 2. Personal Assistence  = 0.1 eth   |");
        System.out.println("| 3. CEO                  = 3 eth     |");
        System.out.println("|-------------------------------------|");
        System.out.println("| Benefits:                           |");
        System.out.println("| 1. anak 1               = 0.01 eth  |");
        System.out.println("| 2. anak 2               = 0.015 eth |");
        System.out.println("| 3. (anak >= 3)          = 0.03 eth  |");
        System.out.println("| 4. istri 1              = 0.02 eth  |");
        System.out.println("| 5. (istri >= 2)         = 0.04 eth  |");
        System.out.println("| 6. Pendidikan Bachelor  = 0.017 eth |");
        System.out.println("| 7. Pendidikan Magister  = -0.04 eth |");
        System.out.println("---------------------------------------");

        System.out.print("Your role: ");
        int role = input.nextInt();

        System.out.print("Total Children : ");
        int child = input.nextInt();

        System.out.print("Total Wife: ");
        int wife = input.nextInt();

        System.out.print("Last Education: ");
        int education = input.nextInt();

        if (role == 1) {
            salary += staff;
        } else if (role == 2) {
            salary += PA;
        } else if (role == 3) {
            salary += CEO;
        } else {
            System.out.print("Uknown role!");
        }

        if (child == 1) {
            salary += child1;
        } else if (child == 2) {
            salary += child2;
        } else if (child >= 3) {
            salary += child3_;
        } else {
            System.out.print("Uknown total child!");
        }

        if (wife == 1) {
            salary += wife1;
        } else if (wife >= 2) {
            salary += wife2_;
        } else {
            System.out.print("Uknown total wife!");
        }

        if (education == 1) {
            salary += bachelor;
        } else if (education >= 2) {
            salary += magister;
        } else {
            System.out.print("Uknown last education!");
        }

        System.out.println("---------------------------------------");
        System.out.println("Your salary: " + salary);

    }
}
