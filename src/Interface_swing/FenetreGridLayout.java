package Interface_swing;

import javax.swing.*;
import java.awt.*;

public class FenetreGridLayout extends JFrame {
    FenetreGridLayout(){
        this.setTitle("Bouton GL");
        this.setSize(300,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        GridLayout g1 = new GridLayout(3,0);
        g1.setHgap(5);
        g1.setVgap(5);
        this.setLayout(g1);

        this.getContentPane().add(new JButton("1"));
        this.getContentPane().add(new JButton("2"));
        this.getContentPane().add(new JButton("3"));
        this.getContentPane().add(new JButton("4"));
        this.getContentPane().add(new JButton("5"));
        this.getContentPane().add(new JButton("6"));
        this.getContentPane().add(new JButton("7"));
        this.getContentPane().add(new JButton("8"));
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new FenetreGridLayout();
    }
}
