package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nombre;
        boolean croissant = true;
        boolean decroissant = true;
        int tableau[] = new int[10];
        for(int i=0;i<10;i++)
        {
            System.out.println("Donnez un entier");
            tableau[i] =scan.nextInt();
        }
        for(int i=0;i<tableau.length-1;i++)
        {
            if (tableau[i]<tableau[i+1])
                decroissant = false;

            if (tableau[i] > tableau[i+1])
                    croissant = false;

            }
        if (decroissant==false)
            System.out.println("ordre croissant");
        else
            if (croissant==false)
            System.out.println("ordre decroissant");

        }

    }

/*
variable
	nombre:entier
	tableau tab[1 10]:type
	croissant=vrai 
	decroissant=faux 
debut :
	Pour(i=1 a i=10)
	Ecrire("Donnez un entier")
	Lire("Tab[i]")
	Fpour
	Pour(i=1 a i=nombre-1)
	Si(tab[i]<tab[i+1])
	decroissant=faux
	Sinon
	Si(tab[i]>tab[i+1])
	croissant=faux
	Fpour
	Si croissant=vrai
	Ecrire("la liste est dans l'ordre croissant")
	Sinon
	Si decroissant=vrai
	Ecrire("la liste est dans l'ordre decroissant")
	Sinon
	Ecrire(la liste est dans l'ordre quelconque)
fin
 */