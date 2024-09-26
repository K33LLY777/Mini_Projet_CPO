package tp1_guessmynumber_sainterose;

import java.util.Random;
import java.util.Scanner;

public class TP1_guessMyNumber_SAINTEROSE {

    public static void main(String[] args) {
        Scanner scaneur = new Scanner(System.in);
        Random generateurAleat = new Random();
        int n, u, maxTentatives = Integer.MAX_VALUE; // par défaut, tentatives illimitées
        int compteur = 0;  // Initialisation du compteur de tentatives
        int intervalleMax = 100;  // Valeur par défaut de l'intervalle maximum
        boolean hlp = false;  // Messages d'aide en mode facile

        // Demander le niveau de difficulté
        System.out.println("Choisissez votre niveau de difficulté :");
        System.out.println("1. Facile (intervalle 0-50, messages d'aide)");
        System.out.println("2. Normal (intervalle 0-100, tentatives illimitées)");
        System.out.println("3. Difficile (intervalle 0-100, 5 tentatives)");

        int choixDifficulte = scaneur.nextInt();

        switch (choixDifficulte) {
            case 1: // Mode Facile
                intervalleMax = 50;
                hlp = true;  // Activer les messages d'aide spécifiques
                break;
            case 2: // Mode Normal
                intervalleMax = 100;
                break;
            case 3: // Mode Difficile
                intervalleMax = 100;
                maxTentatives = 5;  // Limiter les tentatives à 5
                break;
            default:
                System.out.println("Choix invalide, le mode Normal est sélectionné par défaut.");
        }

        // Générer le nombre aléatoire selon l'intervalle choisi
        n = generateurAleat.nextInt(intervalleMax + 1); // Le nombre à deviner

        // Lancer le jeu
        System.out.println("\nSaisissez un nombre entre 0 et " + intervalleMax);

        // Boucle du jeu
        while (compteur < maxTentatives) {  // Limiter les tentatives en mode difficile
            u = scaneur.nextInt();  // Premier nombre saisi par l'utilisateur
            compteur++;  // Incrémente le compteur après chaque saisie

            if (u < 0 || u > intervalleMax) {
                System.out.println("Valeur hors de l'intervalle, veuillez choisir un nombre entre 0 et " + intervalleMax);
            } else if (u < n) {
                if (hlp && (n - u) > 20) {
                    System.out.println("Vraiment trop petit !");
                } else {
                    System.out.println("Trop petit");
                }
            } else if (u > n) {
                if (hlp && (u - n) > 20) {
                    System.out.println("Vraiment trop grand !");
                } else {
                    System.out.println("Trop grand");
                }
            } else {
                System.out.println("Gagné ^^");
                System.out.println("Nombre de tentatives : " + compteur);
                return;  // Sortir de la boucle et terminer le programme si le joueur gagne
            }

            // En mode difficile, afficher un message si le joueur a épuisé ses tentatives
            if (compteur >= maxTentatives && choixDifficulte == 3) {
                System.out.println("Trop de tentatives ! Le nombre a deviner etait : " + n);
                return;
            }

            // Redemander un nombre à l'utilisateur s'il n'a pas encore trouvé le bon
            System.out.println("Réessayez : ");
        }
    }
}
