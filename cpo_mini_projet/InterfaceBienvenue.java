package cpo_mini_projet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * InterfaceBienvenue class to display the welcome screen of the game.
 */
public class InterfaceBienvenue extends JFrame {

    private JButton jouerButton;
    private JLabel titleLabel;
    private JPanel mainPanel;

    /**
     * Constructor to initialize the welcome interface.
     */
    public InterfaceBienvenue() {
        initComponents();
    }

    /**
     * Initialize the components of the interface.
     */
    private void initComponents() {
        mainPanel = new JPanel();
        jouerButton = new JButton("Jouer");
        titleLabel = new JLabel("SUPER DEMINEUR");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainPanel.setBackground(new java.awt.Color(255, 204, 255));
        mainPanel.setPreferredSize(new java.awt.Dimension(400, 400));

        jouerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jouerButtonActionPerformed(evt);
            }
        });

        mainPanel.add(titleLabel);
        mainPanel.add(jouerButton);

        getContentPane().add(mainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }

    /**
     * Action performed when the "Jouer" button is clicked.
     * @param evt ActionEvent triggered by the button click.
     */
    private void jouerButtonActionPerformed(ActionEvent evt) {
        InterfaceChoixDifficulte choixDifficulte = new InterfaceChoixDifficulte();
        choixDifficulte.setVisible(true);
        this.setVisible(false);
    }

    /**
     * Main method to run the InterfaceBienvenue.
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceBienvenue().setVisible(true);
            }
        });
    }
}
