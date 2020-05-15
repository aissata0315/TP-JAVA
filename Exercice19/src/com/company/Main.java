package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int Somme=0;
        int nombre;
        do {
            System.out.println("Entrez un prix");
            nombre=scan.nextInt();
            Somme = Somme + nombre;
        }while(nombre!=0);
        System.out.printf("la somme des prix est:" +Somme);
    }
}
