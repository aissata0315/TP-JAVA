package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
	    int a,b;
        int quotient = 0;
	    System.out.println("Entrez la dividende");
	    a = scan.nextInt();
	    System.out.println("Entrez le diviseur");
	    b = scan.nextInt();
	    while (a>=b)
        {
            a = a-b;
            quotient++;

        }
        System.out.println("la division par succesion succesif donne:" +quotient);


    }
}
/*
entier a,b,q=0;
Debut:
	Ecrire("entre le dididende ");
	Lire("a"),
	Ecrire("Entrez le diviseur");
	Lire("b")
	tant que(a=>b)
	debut tant que:
		a=a-b;
		q=q++;
	fintantque
	Ecrire("La division par ss donne:",q);
fin
 */