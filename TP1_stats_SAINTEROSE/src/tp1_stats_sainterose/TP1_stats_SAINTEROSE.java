package tp1_stats_sainterose;

import java.util.Random;
import java.util.Scanner;

public class TP1_stats_SAINTEROSE {

    public static void main(String[] args) {
        
        // Crée un générateur de nombres aléatoires
        Random random = new Random();
        
        // Compteurs pour chaque face de dé (de 1 à 6)
        int compteur1 = 0, compteur2 = 0, compteur3 = 0, compteur4 = 0, compteur5 = 0, compteur6 = 0;
        
        // Demande à l'utilisateur combien de lancers il souhaite effectuer
        System.out.println("\nVeuillez saisir un nombre de lancers de de :");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();  // Nombre de lancers
        
        // Simulation de lancers de dé
        for (int i = 0; i < m; i++) {
            int resultat = random.nextInt(6) + 1;  // Génère un nombre entre 1 et 6
            
            // Utilisation du switch pour mettre à jour les compteurs
            switch (resultat) {
                case 1 -> compteur1++;
                case 2 -> compteur2++;
                case 3 -> compteur3++;
                case 4 -> compteur4++;
                case 5 -> compteur5++;
                case 6 -> compteur6++;
            }
        }
        
        // Affiche les résultats des lancers
        System.out.println("Resultats des lancers de de :");
        System.out.println("Face 1 : " + compteur1);
        System.out.println("Face 2 : " + compteur2);
        System.out.println("Face 3 : " + compteur3);
        System.out.println("Face 4 : " + compteur4);
        System.out.println("Face 5 : " + compteur5);
        System.out.println("Face 6 : " + compteur6);
    }
}
