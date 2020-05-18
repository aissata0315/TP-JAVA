package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a,b,c,delta;
        double x1,x2,x0=0;
        System.out.println("Donnez a");
        a = scan.nextInt();
        System.out.println("Donnez b");
        b = scan.nextInt();
        System.out.println("Donnez c");
        c = scan.nextInt();
        delta = (b*b)-4*(a*c);
        double racinedelta;
        racinedelta=Math.sqrt(delta);
        if (delta>0)
        {
            x1 = (-b - racinedelta)/2*a;
            x2 = (-b + racinedelta)/2*a;
            System.out.println("les solutions sont:" +x1 +x2);

        }
        else
        if (delta==0)
        {
                x0 = (-b)/(2*a);
            System.out.println("la solution est:" +x0);
        }

    }
}
/* Algorithme
entier a,b,c,Delta;
reel x0,x1,x2;
Debut
	afficher("entrer a")
	lire(a)
	afficher("entrer b ")
	lire(b)
	afficher("entrer c")
	lire(c)
	Delta = pow(b,2)-4*a*b
	si(Delta>0)
		x1 = -b -sqrt(Delta)) / 2a
		x2 = -b +sqrt(Delta)) / 2a
		afficher("x = ",x1," ou x=  ",x2)
	sinon
	si(Delta==0)
		x0 = -b / 2a
		afficher("x = ",x0)
	sinon
		afficher("x n'existe pas")
	finsi
	sinsi
fin

 */