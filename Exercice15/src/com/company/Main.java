package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nombre, somme=0;
        System.out.println("Donnez un nombre");
        nombre = scan.nextInt();
        for (int i=1;i<=nombre;i++)
        {
            somme = somme+i;
        }
        System.out.println("La somme des entiers saisi est:" +somme);


        }
    }
/* entier n,s=0;
Debut:
	Ecrire("Donnez le nombre");
	Lire("n");
	Pour(i=1 jusqu'a i=n)
	Debut pour:
		S=S+i;
	Fin pour:
	Ecrire("la somme des entiers est:",S);
Fin

*****Moyenne*******

entier n,s=0, m;
Debut:
	Ecrire("Donnez le nombre");
	Lire("n");
	Pour(i=1 jusqu'a i=n)
	Debut pour:
		S=S+i;
	Fin pour:
	m= S/n;
	Ecrire("la moyenne des entiers est:",m);
fin*/