package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int j,i;
        for ( i=1;i<=10;i++)
        {
            for (j=1;j<=i;j++)
                System.out.println(i);
        }

    }
}
/*
Variable
	j,i:Entier
Debut:
	Pour(i=1 à 10)
		Pour(j=1 à i)
		Ecrire("i")
		Fpour
	Fpour
Fin
 */