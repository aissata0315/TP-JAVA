package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int heure_depart,heure_arrivé, minute_depart,minute_arrive, duré_en_minute,
                heure_depart_mn,heure_arrivé_mn;
        System.out.println("Donnez l'heure de depart?");
        heure_depart = scan.nextInt();
        minute_depart = scan.nextInt();
        System.out.println("Donnez l(heure d'arrivé");
        heure_arrivé = scan.nextInt();
        minute_arrive = scan.nextInt();

        heure_depart_mn = heure_depart*60+minute_depart;
        heure_arrivé_mn = heure_arrivé*60+minute_arrive;
        duré_en_minute = heure_arrivé_mn - heure_depart_mn;
        duré_en_minute = Math.abs(duré_en_minute);
        System.out.println("La durée du trajet est:" + Math.floor(duré_en_minute/60)+"Heure"+duré_en_minute%60+"minute");

    }
}
/*Algorithme
Entier Hdep, Hdar,Mdep, Mdar, Durée_en_Mn,Durée_en_heure, Hdep_en_Mn, Hdar_en_Mn;

Début:
Ecrire("Donner l'heure de départ");
Lire("Hdep");
Ecrire("Donner minute de départ");
Lire("Mdep")
Ecrire("Donner l'heure d'arriver");
Lire("Hdar");
Ecrire("Donner minute d'arriver");
Lire("Mdar");

Hdep_en_Mn = Hdep*60+Mdep;
Hdar_en_Mn = Hdar*60+Mdar;

Durée_en_Mn = abs(Hdar_en_Mn - Hdep_en_Mn);


Ecrire("La durée du trajet est: ", floor(Durée_en_Mn/60)'Heure'+ Durée_en_Mn%60 'minute');


fin
 */