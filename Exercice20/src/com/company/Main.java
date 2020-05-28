package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nombre,max=0,position=0;
        int tab[] = new int[10];
        for (int i=0;i<tab.length;i++)
        {
            System.out.println("Donnez un entier?");
            nombre = scan.nextInt();
            tab[i]=nombre;
            if (nombre>max)
                max=nombre;
                position=1 ;
        }
        System.out.println("le max est:" +max+"il est la position"+position);

    }
}
/*
Variable
	max=0,indice=0,nombre:entier
	Tab=[10]
Debut:
POur(i=1 à 10)
	Ecrire("Donnez un entier")
	Lire("nombre")
	Tab[i]=nombre
	Si(nombre>max)
		max = nombre
		indice = 1
	Fsi
Fpour
Fin

 */