package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a,b;
        double resultat;
        char c;
        System.out.println("Entrez l'entier a");
        a = scan.nextInt();
        System.out.println("Quel opérarion souhaiterai vous faire?");
        c = scan.next().charAt(0);
        System.out.println("Entrez l'entier b");
        b = scan.nextInt();
        if ('c'=='+')
        {
            resultat = a+b;
            System.out.println("L'addition donne:" +resultat);
        }
        else
            if('c'=='-')
            {
                resultat = a-b;
                System.out.println("La soustraction de"+a+"et "+b+"donne:" +resultat);
            }
            else
                if ('c'=='/')
                {
                    resultat = a/b;
                    System.out.println("La division de"+a+"et "+b+"donne:" +resultat);
                } else
                    if ('c'=='*')
                    {
                        resultat = a*b;
                        System.out.println("La division de"+a+"et "+b+"donne:" +resultat);
                    }

    }
}
/* Algorithme
entier a;
reel r;
char c;

Debut:
	Ecrire("Entrez l'entier a");
	Lire("a);
	Ecrire("Quel opération souhaiterai vous faire?");
	Lire("c");
	Si('c' == '+')
	Debut si:
		r=a+b;
		Ecrire("L'addition de a et b donne:",r);
	fin si;

	Si('c' == '*')
	Debut si:
		r=a*b;
		Ecrire("La multiplication de a et b donne:",r);
	fin si

	Si('c' == '/')
	Debut si:
		r=a/b;
		Ecrire("La division de a et b donne:",r);
	fin si;

	Si('c' == '-')
	Debut si:
		r=a-b;
Ecrire("La soustraction de a et b donne:",r);
	fin si
fin
 */