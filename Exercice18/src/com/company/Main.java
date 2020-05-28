package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b,ppcm;
        System.out.println("Donnez un entier?");
        a = scan.nextInt();
        System.out.println("Donnez un entier?");
        b = scan.nextInt();
        int c=a;
        int d=b;
        while (a!=b) {
            if (a > b)
                b = b+ d;
            if (a < b)
                a = a+c;
        }
        System.out.println("le ppcm est:" +b);





    }
}
/*
entier a, b ppcm;
debut:
	Ecrire("Donnez un nombre")
	Lire("a")
	Ecrire("Donnez un nombre")
	Lire("b")
	tant que(a!=b)
		Si(a>b)
		b=b+b
		Si(b>a)
		a=a+a
	Ftanq
	Ecrire("Le ppcm est:",a)
fin


 */