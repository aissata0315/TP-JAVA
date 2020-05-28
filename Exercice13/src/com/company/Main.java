package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int jour,mois,année;
        System.out.println("Entrez une date?");
        jour = scan.nextInt();
        mois = scan.nextInt();
        année = scan.nextInt();

        int tableau[] = {1,3,5,7,8,10,12};
        for (int i=0; i<tableau.length;i++) {
            if (mois == tableau[i] && jour <= 31)
                System.out.println("la date est valide");
        }
        if (mois==2 && jour<=29) {
            System.out.println("la date est valide");

        }
        else
        { System.out.println("exit");
            return;
        }
        int tableau2[] = {4,6,9,11};
        for (int i=0;i<tableau2.length;i++){
            if (mois==tableau2[i] && jour<=30)
                System.out.println("La date\n"+jour+"\n"+mois+"\n"+année+"est valide");
        }

        }


    }

/*
        entier j, m,a;
Debut:
	Ecrire("Entrez j,m,a"?)
	Lire("j");
	Lire("m");
	Lire("a");
	Si(m=[1,3,5,7,8,10,12]) et (j<=31)
	Ecrire("date valide")
	Sinon
	Ecrire("date invalide")
	Si(m=[4,6,9,11] et (j<=30)
	Ecrire("date valide")
	Sinon
	Ecrire("date invalide")
	Si(m=2) et (j<=29)
	Ecrire("date valide);
	Sinon
	Ecrire("date invalide")
fin
*/