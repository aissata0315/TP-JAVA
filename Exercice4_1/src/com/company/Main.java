package com.company;

import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nombre;
        double puissance, x;
        System.out.println("Entrez la valeur x");
        x = scan.nextDouble();
        System.out.println("Entres le nombre");
        nombre = scan.nextInt();
        puissance = Math.pow(x,nombre);
        System.out.println("La puissance est:" +puissance);


    }
}
/* Algorithme
    entier n;
reel p,x;
Debut
	afficher("entrer la valeur de x")
	lire(x)
	afficher("entrer la valeur de n")
	lire(n)
	p=pow(x,n)
	afficher(x," a la puissance ",n," est ",p)
fin
 */