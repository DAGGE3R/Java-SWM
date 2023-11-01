package Interface_swing;

import javax.swing.*;

public class Fenetre extends JFrame {

    public Fenetre(){
        JButton addi=new JButton("Button");

        // With Panel

       /* JPanel p= new JPanel();
        p.add(addi);
        this.setContentPane(p);
        */


        // The button without Panel
        this.getContentPane().add(addi);
        this.setSize(300,150);
        this.setTitle("Buttons");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);


    }
     public static void main(String[] args) {
        new Fenetre();
    }
}
