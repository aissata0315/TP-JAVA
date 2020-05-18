package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x1,x2,y1,y2, distance;
        System.out.println("Entrez les coordonnées du point A");
        x1 = scan.nextDouble();
        y1 = scan.nextDouble();
        System.out.println("Entrez les coordonnées du point B");
        x2 = scan.nextDouble();
        y2 = scan.nextDouble();
        distance = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        System.out.println("La distance entre A et B est:" +distance);
    }
}
/* Algorithme
reel x1,y1,x2,y2,dist;
Debut:
	Ecrire("Entrez les coordonnées du point A");
	Lire("x1");
	Lire("y1")
	Ecrire("Entrez les coordonnées du point B");
Lire("x2");
	Lire("y2");

dist = sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));

	Ecrire("La distance entre A et B est:", dist);

fin

 */