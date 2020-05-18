package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int R1,R2,R3,RS;
        double RP;
        System.out.println("Entrez la resistance r1");
        R1 = scan.nextInt();
        System.out.println("Entrez la resistance r2");
        R2 = scan.nextInt();
        System.out.println("Entrez la resistance r3");
        R3 = scan.nextInt();
        RS = R1+R2+R3;
        System.out.println("La resistance en serie est:" +RS);
        if((R1==0 && R2==0) || (R1==0 && R3==0) || (R2==0 && R3==0))
        {
            System.out.println("Impossible de calculer la resistance en paralléle");
        } else
        {
            RP = (R1*R2*R3) / (R1*R2+R1*R3+R2*R3);
            System.out.println("La resistance en paralléle" +RP);
        }
    }
}
/* Algorithme
entier r1,r2,r3,RS;
reel RP;
debut
afficher(" entrer la resistance R1")
	lire(r1)
	afficher(" entrer la resistance R2")
	lire(r2)
	afficher(" entrer la resistance R3")
	lire(r3)
	RS = r1+r2+r3
	afficher("la resistance en serie est ",RS)

	si((r==0 ET r2==0)OU(r1==0 ET r3==0)OU(r2==0 ET r3==0)) 	alors
	afficher("Impossible de calculer la RP ")
	sinon
	RP = (r1*r2*r3) / (r1*r2+r1*r3+r2*r3)
	afficher("la resistance en parallelle est ",RP)
	finsi
fin


 */