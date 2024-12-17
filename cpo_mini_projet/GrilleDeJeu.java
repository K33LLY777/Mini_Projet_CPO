package cpo_mini_projet;

import java.util.Random;

/**
 * Class representing the game grid for a Minesweeper-like game.
 */
public class GrilleDeJeu {
    private Cellule[][] matriceCellules;
    private int nbLignes;
    private int nbColonnes;
    private int nbBombes;

    /**
     * Constructor to initialize the game grid with specified dimensions and number of bombs.
     * @param nbLignes Number of rows in the grid.
     * @param nbColonnes Number of columns in the grid.
     * @param nbBombes Number of bombs to place in the grid.
     */
    public GrilleDeJeu(int nbLignes, int nbColonnes, int nbBombes) {
        this.nbLignes = nbLignes;
        this.nbColonnes = nbColonnes;
        this.nbBombes = nbBombes;
        this.matriceCellules = new Cellule[nbLignes][nbColonnes];
        initialiserGrille();
        placerBombesAleatoirement();
        calculerBombesAdjacentes();
    }

    /**
     * Initializes the grid by creating a new Cellule object for each cell.
     */
    private void initialiserGrille() {
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j] = new Cellule();
            }
        }
    }

    /**
     * Randomly places bombs in the grid.
     */
    private void placerBombesAleatoirement() {
        Random random = new Random();
        int bombesPlacees = 0;
        while (bombesPlacees < nbBombes) {
            int ligne = random.nextInt(nbLignes);
            int colonne = random.nextInt(nbColonnes);
            if (!matriceCellules[ligne][colonne].getPresenceBombe()) {
                matriceCellules[ligne][colonne].placerBombe();
                bombesPlacees++;
            }
        }
    }

    /**
     * Calculates the number of adjacent bombs for each cell in the grid.
     */
    private void calculerBombesAdjacentes() {
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                if (!matriceCellules[i][j].getPresenceBombe()) {
                    int nbBombesAdj = compterBombesAdjacentes(i, j);
                    matriceCellules[i][j].setNbBombesAdjacentes(nbBombesAdj);
                }
            }
        }
    }

    /**
     * Counts the number of bombs adjacent to a given cell.
     * @param ligne Row index of the cell.
     * @param colonne Column index of the cell.
     * @return Number of adjacent bombs.
     */
    private int compterBombesAdjacentes(int ligne, int colonne) {
        int bombes = 0;
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if (i == 0 && j == 0) continue;
                int nouvelleLigne = ligne + i;
                int nouvelleColonne = colonne + j;
                if (nouvelleLigne >= 0 && nouvelleLigne < nbLignes &&
                    nouvelleColonne >= 0 && nouvelleColonne < nbColonnes &&
                    matriceCellules[nouvelleLigne][nouvelleColonne].getPresenceBombe()) {
                    bombes++;
                }
            }
        }
        return bombes;
    }

    /**
     * Reveals a cell at the specified position.
     * @param ligne Row index of the cell.
     * @param colonne Column index of the cell.
     */
    public void revelerCellule(int ligne, int colonne) {
        if (ligne < 0 || ligne >= nbLignes || colonne < 0 || colonne >= nbColonnes) {
            return;
        }
        Cellule cellule = matriceCellules[ligne][colonne];
        if (cellule.getDevoilee()) {
            return;
        }
        cellule.revelerCellule();
        if (cellule.getPresenceBombe()) {
            System.out.println("Boom! Vous avez révélé une bombe. Fin de la partie !");
            afficherInterfaceDefaite();
            return;
        }
        if (cellule.getNbBombesAdjacentes() == 0) {
            for (int i = -1; i <= 1; i++) {
                for (int j = -1; j <= 1; j++) {
                    if (i == 0 && j == 0) continue;
                    revelerCellule(ligne + i, colonne + j);
                }
            }
        }
    }

    /**
     * Checks if all safe cells have been revealed.
     * @return True if all safe cells are revealed, false otherwise.
     */
    public boolean toutesCellulesRevelees() {
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                if (!matriceCellules[i][j].getPresenceBombe() && !matriceCellules[i][j].getDevoilee()) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Displays the grid for testing purposes.
     */
    public void afficherGrille() {
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                if (matriceCellules[i][j].getPresenceBombe()) {
                    System.out.print("B ");
                } else {
                    System.out.print(matriceCellules[i][j].getNbBombesAdjacentes() + " ");
                }
            }
            System.out.println();
        }
    }

    /**
     * Displays the defeat interface.
     */
    private void afficherInterfaceDefaite() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceDefaite().setVisible(true);
            }
        });
    }
}
