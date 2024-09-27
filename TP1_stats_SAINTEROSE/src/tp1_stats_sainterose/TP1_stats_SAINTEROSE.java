package tp1_stats_sainterose;

import java.util.Random;
import java.util.Scanner;

public class TP1_stats_SAINTEROSE {

    public static void main(String[] args) {
        // Déclarer un tableau de taille 6
        int tab[] = new int[6];
        int i = 0; // Initialiser le compteur i

        // Demander à l'utilisateur une valeur entière
        System.out.println("\nSaisissez une valeur entière (le nombre d'itérations souhaitées) :");
        Scanner scann = new Scanner(System.in);  // Correction de la syntaxe
        int m = scann.nextInt();  // Lire l'entier entré par l'utilisateur

        // Boucle while pour générer des valeurs aléatoires et les stocker dans le tableau
        while (i < m && i < tab.length) {  // S'assurer que m ne dépasse pas la taille du tableau (6)
            Random generateurAleat = new Random();
            int n = generateurAleat.nextInt(6);  // Génére un nombre aléatoire entre 0 et 5
            tab[i] = n;  // Stocker la valeur dans le tableau
            i++;  // Incrémenter le compteur
        }

        // Afficher les valeurs du tableau générées
        System.out.println("Voici les valeurs générées : ");
        for (int j = 0; j < i; j++) {
            System.out.println("Valeur " + (j+1) + " : " + tab[j]);
        }
    }
}
