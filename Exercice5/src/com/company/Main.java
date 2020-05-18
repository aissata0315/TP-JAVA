package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int somme=0,i,nombre;
        for (i=1;i<=5;i++)
        {
            System.out.println("Entrez une valeur?");
            i = scan.nextInt();
            somme = somme +i;
        }
        System.out.println("la somme est:" +somme);
    }
}
/* Algorithme
entier a,s,i;
Debut
	s=0
	pour(i =1 a 5)
		afficher("entrer la valeur ",i)
		lire(i)
		s=s+i
	finpour
	afficher("l somme est ",s)
fin
 */