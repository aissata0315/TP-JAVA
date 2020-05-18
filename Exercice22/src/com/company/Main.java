package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nombre, x,longueur = 0,debut = 0,fin = 0,k,j;
        int tableauentier[] = new int[100];
        //System.out.println("Donnez la taille du tableau");
        //x = scan.nextInt();
        for(int i=0;i<15;i++)
        {
            System.out.println("Entrez un entier");
            nombre =scan.nextInt();
                tableauentier[i] = nombre;

        } //System.out.println("afficher le tab" +Arrays.toString(tableauentier));
        for (int i=0; i<15; i++)
        {
            k=i;
            j=i+1;
            while (tableauentier[k]<tableauentier[j])
            {
                k=i+1;
                j=j+1;
            }
            if (j-i>longueur)
            {
                debut = i;
                fin = j-1;
                longueur=j-i;
            }
            i=k;
        }
        System.out.println("La plus grande séquance est de longueur\n" +longueur+"\nelle debut a\n"+debut+
               "\net se termine a\n"+fin);
        /*for ( int i=debut; i<=fin; i++ ) {
            System.out.println( tableauentier[ i ] );
        }*/


    }
}
/* Algorithma
Variables
	nombre,x,,longueur=0,debut=0,fin:entier
	tableau tab[10 50]:type
	Ecrire("entrez le nombre d'elements du tableau")
	lire("x")
	Pour(i=1 à x)
		Ecrire(Entrez le ieme entier?")
		Lire("nombre")
		Si(1 <tab[i] <100)
		tab[i]=nombre
	Fpour
	Pour(i=1 a i=n-1)
		k=i
		j=i+1
		Tantque(tab[k]<tab[j]
			k=k+1
			j=j+1
		Ftantq
		Si(j-i>longueur)
			debut = i
			fin = k
			longueur = j-i
		Finsi
		i=k
	finpour


	Ecrire("la sequence la plus longue est de longueur :"+longueur+"elle debute a "+debut+"et se termine a"+fin+)
 */