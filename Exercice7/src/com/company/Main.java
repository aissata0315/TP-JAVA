package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int montant, x,y,z,t;
        double B20,B10,B5,P2,P1;
        System.out.println("Donnez le montant à decomposer");
        montant = scan.nextInt();
        B20 = Math.floor(montant/20);
        x = montant%20;
        B10 = Math.floor(x/10);
        y = x%10;
        B5 = Math.floor(y/5);
        z = y%5;
        P2 = Math.floor(z/2);
        t = z%2;
        P1 = t;
        //int i= (int) B20; pour convertir du double au int
        System.out.println("le montant peut etre decomposé en:" +B20+"billet de 20\n" +B10+"billet de 10\n"+B5+"billet de 5"
                +P2+"piece de 2"+P1+"piece de 1");
    }
}
/*Algorithme
entier mont, B20,B10,B5,P2,P1; x,y,z,t;
Debut:
	Ecrire("Donnez un montant");
	Lire("mont");
	B20 = floor(mont/20);
	x = mont%20;
	B10 = floor(x/10);
	y = x%10;
	B5 = floor(y/5);
	z = y%5;
	P2 = floor(z/2);
	t = z%2;
	P1 = t;
	Ecrire("Le montant peut etre decomposé en:", B20 'billet 	de 20'+ B10 'Billet de 10'+ B5 'Billet de 5'+ P2 'piece 	de 2'+ P1 'piece de 1')
Fin
 */