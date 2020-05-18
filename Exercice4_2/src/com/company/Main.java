package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nombre;
        double puissance=1, x;
        System.out.println("Entrez la valeur x");
        x = scan.nextDouble();
        System.out.println("Entres le nombre");
        nombre = scan.nextInt();
        if (nombre==0)
            puissance = 1;
        else
        {
            for (int i=1; i<=Math.abs(nombre); i++)
            {
                puissance = puissance*x;
            }
        }
        if (nombre < 0)
            puissance = 1/x;
        System.out.println("La puissance est:" +puissance);
    }
}
/* Algorithme
entier n, i;
reel p,x;
Debut
	afficher("entrer la valeur de x")
	lire(x)
	afficher("entrer la valeur de n")
	lire(n)
	si(n==0)
		p=1
	sinon
		pour(i=1 a abs(n))
			p = p*x
		finpour
	si(n<0)
	p=1/p
	finsi
	finsi
	afficher(x,' a la puissance ",n," est ",p)
fin
 */