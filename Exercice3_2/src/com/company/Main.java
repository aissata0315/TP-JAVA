package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int R1,R2,R3,RS,choix;
        double RP;
        System.out.println("Entrez la resistance r1");
        R1 = scan.nextInt();
        System.out.println("Entrez la resistance r2");
        R2 = scan.nextInt();
        System.out.println("Entrez la resistance r3");
        R3 = scan.nextInt();
        do {
            System.out.println("Qu'elle resistence souhaiterai vous calculer?");
            System.out.println(" 1 .Résistence en série");
            System.out.println(" 2 .Résistence en parallele");
            choix=scan.nextInt();
            switch (choix){
                case 1:
                    RS = R1+R2+R3;
                    System.out.println("La resistance en serie est:" +RS);
                    break;
                case 2:
                    if((R1==0 && R2==0) || (R1==0 && R3==0) || (R2==0 && R3==0))
                    {
                        System.out.println("Impossible de calculer la resistance en paralléle");
                    } else
                    {
                        RP = (R1*R2*R3) / (R1*R2+R1*R3+R2*R3);
                        System.out.println("La resistance en paralléle" +RP);
                    } break;
                default:System.out.println("Veuillez respecter le menu!");
            }


        } while (choix!=2);
    }
}
/* Algorithme
    entier r1,r2,r3,rs,choix;
chaine q;
debut
	afficher(" entrer la resistance R1")
	lire(r1)
	afficher(" entrer la resistance R2")
	lire(r2)
	afficher(" entrer la resistance R3")
	lire(r3)

	répeter
		afficher("Quelle resistance voulez-vous calculer?")
		afficher("1------Resistance en Serie")
		afficher("2------Resistance en Parallele")
		lire(choix)
		selon choix faire
			cas 1 :
				rs = r1+r2+r3
				afficher("la RS est ",rs)
			cas 2 :

			si((r1===0 ET r2==0) OU (r1==0 ET r3==0) OU 			(r2==0 ET r3==0))
			alors
			afficher("Impossible de calculer RP")
			sinon
			rp = (r1*r2*r3) / (r1*r2+r1*r3+r2*r3)
			afficher("la RP est ",rp)
			finsi
			sinon
			afficher("votre choix n'existe pas ")
		finSelon
		afficher("voulez-vous continué O/n")
		lire(q)
	jusqua(q=="n")
fin
 */