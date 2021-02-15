import java.util.Random;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import entities.Window;

public class LancioDado {

    /**
     *
     */
    private static final String INVALID_INPUT_MESSAGE = "Inserisci un numero valido!";

    public static void main(String[] args) throws Exception {

        Window window = new Window("App", false, true);
        JButton lancio = new JButton();
        JPanel panelInserimentoFacce = new JPanel();
        JPanel panelLancioDado = new JPanel();
        JPanel panelRisultato = new JPanel();
        JPanel panelTitolo = new JPanel();
        JTextField nFacceField = new JTextField(10);
        JTextField risultato = new JTextField(15);
        JLabel titoloApp = new JLabel("<html><h1>DADO K-ATARTICO</h1></html>");
        JLabel nFacceLabel = new JLabel("NUMERO FACCE");

        //Set Image on the button (and resize it)
        lancio.setIcon(new ImageIcon(
                new ImageIcon("src\\images\\dado.png").getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT)));
        
        //Button configs
        lancio.setPreferredSize(new Dimension(100, 100));
        lancio.setOpaque(false);
        lancio.setContentAreaFilled(false);
        lancio.setBorderPainted(false);
                
        //Make JField NOT editable
        risultato.setEditable(false);
        
        //Add Components to Panels
        panelLancioDado.add(lancio);
        panelTitolo.add(titoloApp);
        panelInserimentoFacce.add(nFacceLabel);
        panelInserimentoFacce.add(nFacceField);
        panelRisultato.add(risultato);

        //Action Listener on JButton
        lancio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random rnd = new Random();
                if (nFacceField.getText().equalsIgnoreCase("") || nFacceField.getText().equalsIgnoreCase("0")) {
                    risultato.setText(INVALID_INPUT_MESSAGE);
                } else {
                    int risultatoLancio = (rnd.nextInt(Integer.parseInt(nFacceField.getText())) + 1);
                    risultato.setText(risultatoLancio + "");
                }
            }

        });

        //Panels
        panelInserimentoFacce.setOpaque(false);
        panelTitolo.setOpaque(false);
        panelLancioDado.setOpaque(false);
        panelRisultato.setOpaque(false);
        
        //Window's Components
        window.add(panelTitolo);
        window.add(panelInserimentoFacce);
        window.add(panelLancioDado);
        window.add(panelRisultato);
        
        //Create Window
        window.createWindow(window);
    }
}