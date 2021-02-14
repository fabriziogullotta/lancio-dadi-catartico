import java.util.Random;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LancioDado {

    // private static final int WINDOW_HEIGHT = 600;
    // private static final int WINDOW_WIDTH = 800;

    public static void main(String[] args) throws Exception {

        JFrame window = new JFrame();
        JButton lancio = new JButton();
        JPanel panelInserimentoFacce = new JPanel();
        JPanel panelLancioDado = new JPanel();
        JPanel panelRisultato = new JPanel();
        JPanel panelTitolo = new JPanel();
        JTextField nFacceField = new JTextField(10);
        JTextField risultato = new JTextField(15);
        JLabel titoloApp = new JLabel();
        JLabel nFacceLabel = new JLabel();

        titoloApp.setText("<html><h1>DADO K-ATARTICO</h1></html>");

        lancio.setIcon(new ImageIcon(
                new ImageIcon("src\\images\\dado.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT)));

        nFacceLabel.setText("NUMERO FACCE");
        risultato.setEditable(false);

        lancio.setPreferredSize(new Dimension(100, 100));
        lancio.setOpaque(false);
        lancio.setContentAreaFilled(false);
        lancio.setBorderPainted(false);

        panelLancioDado.add(lancio);
        panelTitolo.add(titoloApp);
        panelInserimentoFacce.add(nFacceLabel);
        panelInserimentoFacce.add(nFacceField);
        panelRisultato.add(risultato);

        lancio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random rnd = new Random();
                if (nFacceField.getText().equalsIgnoreCase("") || nFacceField.getText().equalsIgnoreCase("0")) {
                    risultato.setText("Inserisci un numero valido!");
                } else {
                    int risultatoLancio = (rnd.nextInt(Integer.parseInt(nFacceField.getText())) + 1);
                    risultato.setText(risultatoLancio + "");
                }
            }

        });

        window.getContentPane().setLayout(new BoxLayout(window.getContentPane(), BoxLayout.Y_AXIS));

        // panelInserimentoFacce.setBounds((WINDOW_WIDTH/2)-100, 0, 200, 50); //x-y-w-h
        panelInserimentoFacce.setOpaque(false);
        
        panelTitolo.setOpaque(false);

        // panelLancioDado.setBounds((WINDOW_WIDTH/2)-100, 100, 200, 200);
        panelLancioDado.setOpaque(false);

        // panelRisultato.setBounds((WINDOW_WIDTH/2)-100, 500, 200, 50);
        panelRisultato.setOpaque(false);


        window.setTitle("App");
        window.getContentPane().setBackground(Color.ORANGE);
        window.add(panelTitolo);
        window.add(panelInserimentoFacce);
        window.add(panelLancioDado);
        window.add(panelRisultato);
        window.setResizable(false);
        // window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        window.pack();
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);

    }
}