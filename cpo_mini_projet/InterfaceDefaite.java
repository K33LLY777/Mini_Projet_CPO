package cpo_mini_projet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * InterfaceDefaite class to display the defeat screen when the player loses the game.
 */
public class InterfaceDefaite extends JFrame {

    private JButton retryButton;
    private JButton changeDifficultyButton;
    private JButton menuButton;
    private JLabel defeatLabel;
    private JPanel mainPanel;

    /**
     * Constructor to initialize the defeat interface.
     */
    public InterfaceDefaite() {
        initComponents();
    }

    /**
     * Initialize the components of the interface.
     */
    private void initComponents() {
        mainPanel = new JPanel();
        retryButton = new JButton("Réessayer");
        changeDifficultyButton = new JButton("Changer difficulté");
        menuButton = new JButton("Menu");
        defeatLabel = new JLabel("VOUS AVEZ PERDU!!!!");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainPanel.setBackground(new java.awt.Color(102, 153, 255));
        mainPanel.setPreferredSize(new java.awt.Dimension(400, 400));

        retryButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                retryButtonActionPerformed(evt);
            }
        });

        changeDifficultyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                changeDifficultyButtonActionPerformed(evt);
            }
        });

        menuButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                menuButtonActionPerformed(evt);
            }
        });

        mainPanel.add(defeatLabel);
        mainPanel.add(retryButton);
        mainPanel.add(changeDifficultyButton);
        mainPanel.add(menuButton);

        getContentPane().add(mainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }

    /**
     * Action performed when the "Réessayer" button is clicked.
     * @param evt ActionEvent triggered by the button click.
     */
    private void retryButtonActionPerformed(ActionEvent evt) {
        // Logic to restart the game with the current difficulty
        // Example: new Game(currentDifficulty).setVisible(true);
        this.dispose();
    }

    /**
     * Action performed when the "Changer difficulté" button is clicked.
     * @param evt ActionEvent triggered by the button click.
     */
    private void changeDifficultyButtonActionPerformed(ActionEvent evt) {
        InterfaceChoixDifficulte choixDifficulte = new InterfaceChoixDifficulte();
        choixDifficulte.setVisible(true);
        this.dispose();
    }

    /**
     * Action performed when the "Menu" button is clicked.
     * @param evt ActionEvent triggered by the button click.
     */
    private void menuButtonActionPerformed(ActionEvent evt) {
        InterfaceBienvenue bienvenue = new InterfaceBienvenue();
        bienvenue.setVisible(true);
        this.dispose();
    }

    /**
     * Main method to run the InterfaceDefaite.
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceDefaite().setVisible(true);
            }
        });
    }
}
