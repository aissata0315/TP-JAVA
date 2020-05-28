package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nombre,Somme=0;
        System.out.println("Donnez un nombre?");
        nombre = scan.nextInt();
        for (int i=1;i<=nombre/2;i++){
            if (nombre%i==0);
            Somme = Somme+i;
        }
        if (nombre==Somme) {
        System.out.println("le nombre que vous avez entrez est un nombre parfait");

        } else
            System.out.println("le nombre n'est pas parfait");

    }
}
/*entier n, somme diviseur S=0;
Debut:
	Ecrire("Donnez un entier");
	Lire("n");
	Pour(i=1 jusqu'a i=n/2)
	debut pour:
		Si(n%i=0)
		debut si:
		S=S+i;
		fin Si
	fin pour
	Si(S=n)
	Ecrire("Le nombre n est parfait");
	Sinon:
	Ecrire("Le nombre n n'est pas parfait);
*/