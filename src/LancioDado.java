import java.util.Random;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LancioDado {
    public static void main(String[] args) throws Exception {

        JFrame window = new JFrame();
        JButton lancio = new JButton("LANCIA!");
        JPanel panelInserimentoFacce = new JPanel();
        JPanel panelLancioDado = new JPanel();
        JPanel panelRisultato = new JPanel();
        JTextField nFacceField = new JTextField(10);
        JTextField risultato = new JTextField(15);
        JLabel nFacceLabel = new JLabel();

        nFacceLabel.setText("NUMERO FACCE");

        lancio.setPreferredSize(new Dimension(90, 70));
        panelLancioDado.add(lancio);
        panelRisultato.add(risultato);
        panelInserimentoFacce.add(nFacceLabel);
        panelInserimentoFacce.add(nFacceField);

        lancio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random rnd = new Random();
                if(nFacceField.getText().equalsIgnoreCase("") || nFacceField.getText().equalsIgnoreCase("0")){
                    risultato.setText("Inserisci un numero valido!");
                } else {
                    int risultatoLancio = (rnd.nextInt(Integer.parseInt(nFacceField.getText())) +1);
                    risultato.setText(risultatoLancio + "");
                }
            }

        });

        window.setTitle("K-ATALESSI || LANCIO DADO");
        window.add(panelInserimentoFacce, BorderLayout.NORTH);
        window.add(panelLancioDado, BorderLayout.CENTER);
        window.add(panelRisultato, BorderLayout.SOUTH);
        window.setSize(300, 200);
        window.setDefaultCloseOperation(3);
        window.setVisible(true);

    }
}