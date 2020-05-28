package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nombre_a_deviné,nombre_deviné, tentative = 0;
        System.out.println("Entrez un nombre de votre choix!");
        nombre_a_deviné = scan.nextInt();
        do {
            System.out.println("Devinez le nombre!");
            nombre_deviné = scan.nextInt();
            tentative++;
            if (nombre_deviné>nombre_a_deviné)
                System.out.println("trop grand");
            if (nombre_deviné<nombre_a_deviné)
                System.out.println("trop petit");
        } while (nombre_a_deviné!=nombre_deviné);
        if (nombre_a_deviné==nombre_deviné)
            System.out.println("bravo! vous avez deviné le nombre apres"+tentative+"tentatives");

    }
}
/*
Variable
	nombre, x : Entier
Début:

	Ecrire("Entrez le nombre"
	Lire("nombre")

	Faire:
		Ecrire("Devinez le nombre")
		Lire("x")
		Si(x>nombre)
		Ecrire("trop grand")
		Si(x<nombre)
		Ecrire("trop petit"
	tant que(x!=nombre)
	Si(x=nombre)
	Ecrire("Bravo!! vous avez deviné le nombre!")
fin
 */