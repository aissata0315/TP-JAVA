package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int jour,mois,année;
        System.out.println("Entrez une date?");
        jour = scan.nextInt();
        mois = scan.nextInt();
        année = scan.nextInt();
        if ( année%4==0 && année%100!=0 | année%400==0)

            System.out.println("L'année"+" "+année+" "+"est bisextile");
        else
            System.out.println("L'année n'est pas bisextile");
    }
}
/*j,m,a:entier
début
écrire("entrer la date ")
écrire("j")
lire(j)
écrire("m")
lire(m)
écrire("a")
lire(a)
écrire("Entrer l'année")
lire(a)
si( a mod 400==0 OU a mod 4==0 ET a mod 100!=0) alors
ecrire(a," est bisextile")
sinon
ecrire(a," n'est pas bisextile")
finsi
fin*/