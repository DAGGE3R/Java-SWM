package Interface_swing;

import javax.swing.*;
import java.awt.*;

public class FenetreFlowLayout extends JFrame {
    private JPanel pan = new JPanel();
    FenetreFlowLayout(){
        this.setTitle("Bouton FL");
        this.setSize(300,150);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        pan.setLayout(new FlowLayout());

        pan.add(new JButton("Button 1 "));
        pan.add(new JButton("Button 2 "));
        pan.add(new JButton("Button 3 "));
        pan.add(new JButton("Button 4 "));
        pan.add(new JButton("Button 5 "));
        this.setContentPane(pan);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new FenetreFlowLayout();
    }
}
