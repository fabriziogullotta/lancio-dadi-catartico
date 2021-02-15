package entities;

import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.JFrame;

public class Window extends JFrame {

    private String titolo;
    private boolean isResizable;
    private boolean isVisible;

    public Window(String titolo, boolean isResizable, boolean isVisible) {
        this.titolo = titolo;
        this.isResizable = isResizable;
        this.isVisible = isVisible;
    }


    public String getTitolo() {
        return this.titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public boolean isIsResizable() {
        return this.isResizable;
    }

    public boolean getIsResizable() {
        return this.isResizable;
    }

    public void setIsResizable(boolean isResizable) {
        this.isResizable = isResizable;
    }

    public boolean isIsVisible() {
        return this.isVisible;
    }

    public boolean getIsVisible() {
        return this.isVisible;
    }

    public void setIsVisible(boolean isVisible) {
        this.isVisible = isVisible;
    }


    public void createWindow(Window window){
        window.setTitle(window.getTitolo());
        window.getContentPane().setBackground(Color.ORANGE);
        window.getContentPane().setLayout(new BoxLayout(window.getContentPane(), BoxLayout.Y_AXIS));
        window.setResizable(isResizable);
        window.pack();
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(isVisible);
    }
    

}
