package com.company;

import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rayon;
        double surface, perimetre;

        System.out.println("Entrez le rayon du cercle");
        rayon = scan.nextInt();
        perimetre = 8*rayon*Math.atan(1);
        surface = 4*(rayon*rayon)*Math.atan(1);
        System.out.println("Le perimetre du cercle est:" +perimetre);
        System.out.println("La surface du cercle est:" +surface);


    }
}
  /* Algorithme
  entier r,s;
constante p;
	début
		afficher(“entrer le rayon du cercle ”)
		lire(r)
		p = 8*r*atan(1)
		s = 4*r*r*atan(1)
		afficher(“le périmètre du cercle est “,p)
		afficher(“la surface du cercle est “,s)
	fin
   */