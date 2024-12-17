package cpo_mini_projet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * InterfaceChoixDifficulte class to allow users to select the difficulty level of the game.
 */
public class InterfaceChoixDifficulte extends JFrame {

    private JButton facileButton;
    private JButton modereButton;
    private JButton difficileButton;
    private JLabel titleLabel;
    private JPanel mainPanel;

    /**
     * Constructor to initialize the difficulty selection interface.
     */
    public InterfaceChoixDifficulte() {
        initComponents();
    }

    /**
     * Initialize the components of the interface.
     */
    private void initComponents() {
        mainPanel = new JPanel();
        facileButton = new JButton("Facile");
        modereButton = new JButton("Modéré");
        difficileButton = new JButton("Difficile");
        titleLabel = new JLabel("Choisir la difficulté");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainPanel.setBackground(new java.awt.Color(255, 153, 255));
        mainPanel.setPreferredSize(new java.awt.Dimension(400, 400));

        facileButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                startGameWithDifficulty(1);
            }
        });

        modereButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                startGameWithDifficulty(2);
            }
        });

        difficileButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                startGameWithDifficulty(3);
            }
        });

        mainPanel.add(titleLabel);
        mainPanel.add(facileButton);
        mainPanel.add(modereButton);
        mainPanel.add(difficileButton);

        getContentPane().add(mainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }

    /**
     * Starts a new game with the selected difficulty level.
     * @param difficulty The difficulty level selected by the user.
     */
    private void startGameWithDifficulty(int difficulty) {
        InterfaceDemineurV2 gameInterface = new InterfaceDemineurV2(difficulty);
        gameInterface.setVisible(true);
        this.setVisible(false);
    }

    /**
     * Main method to run the InterfaceChoixDifficulte.
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceChoixDifficulte().setVisible(true);
            }
        });
    }
}
