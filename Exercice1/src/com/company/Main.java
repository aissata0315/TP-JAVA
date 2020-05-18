package com.company;

import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a,b;
        double ratio, quotient, reste;
        System.out.println("Entrez la valeur de a");
        a = scan.nextInt();
        System.out.println("Entrez la valeur de b");
        b = scan.nextInt();
        if(b==0)
        {
            System.out.println("Impossible de faire la division");
        }
        else
        {
            quotient = Math.floor(a/b);
            reste = a%b;
            ratio = 100*(a/b);
            System.out.println("le quotient est:" +quotient);
            System.out.println("le reste est:" +reste);
            System.out.println("le ratio est:" +ratio);
        }


    }
}
    // Algorithme
    /*entier a,b,q,r;
    reel ratio;
    debut
    afficher(“entrer la valeur de a")
            lire(a)
    afficher(“entrer la valeur de b ”)
    lire(b)
    si(b==0) alors
    afficher(“impossible “)
    sinon
            q = floor(a/b)
			r = a%b
                    ratio = 100*a/b
                    afficher(“le quotient est “,q)
                    afficher(“le reste  “,r)
                    afficher(“le ratio est  “,ratio)
                    finsi
                    fin*/
