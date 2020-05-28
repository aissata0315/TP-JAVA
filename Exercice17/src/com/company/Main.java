package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b,pgcd;
        System.out.println("Donnez un entier?");
        a = scan.nextInt();
        System.out.println("Donnez un entier?");
        b = scan.nextInt();
        while (a != b)
        {
            if (a>b)
                a = a-b;
            if(b>a)
                b = b-a;
        }
        System.out.println("le pgcd est:" +b);

    }
}
/* entier a, b pgcd;
debut:
	Ecrire("Donnez un nombre")
	Lire("a")
	Ecrire("Donnez un nombre")
	Lire("b")
	tant que(a!=b)
		Si(a>b)
		a=a-b
		Si(b>a)
		b=b-a
	Ftanq
	Ecrire("Le pgcd est:",b)
fin
	*/