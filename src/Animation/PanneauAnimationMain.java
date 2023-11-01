package Animation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanneauAnimationMain extends JFrame implements ActionListener {
    PanneauAnimation pan = new PanneauAnimation();
    JButton button2 = new JButton("Stop");
    JButton button3 = new JButton("Start");
    JLabel label = new JLabel("Bouncing Ball");

    Font font = new Font("Arial", Font.BOLD , 16);
    JPanel south  = new JPanel();


    boolean retourX = false ;
    boolean retourY = false ;
    private Thread t ;
    private boolean animated = false ;

    public void setAnimated(boolean animated) {
        this.animated = animated;
    }

    PanneauAnimationMain(){

            this.setTitle("Animation");
            this.setSize(300,300);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setLocationRelativeTo(null);
            this.setLayout(new BorderLayout());
            this.add(pan,BorderLayout.CENTER);
            this.add(label,BorderLayout.NORTH);
            this.add(south,BorderLayout.SOUTH);


            south.add(button3);
            south.add(button2);
            label.setHorizontalAlignment(JLabel.CENTER);
            label.setForeground(Color.BLUE);
            label.setFont(font);

            button2.addActionListener(e -> {
                    this.animated = false ;
                    button3.setEnabled(true);
                    button2.setEnabled(false);
                });

            button3.addActionListener(e-> {
                this.setAnimated(true);
                t= new Thread(new PlayAnimation());
                t.start();
                button3.setEnabled(false);
                button2.setEnabled(true);
            });

            this.setVisible(true);

        }

    public void innCord() {

        int x = pan.getPosY();
        int y = pan.getPosY();

        while (this.animated) {

            if (x<1) retourX=false ;
            if (y<1) retourY=false ;

            if (x>pan.getWidth()-50)
                retourX = true;
            if (y>pan.getHeight()-50)
                retourY = true;

            if (!retourX) {
                pan.setPosX(++x) ;
            } else pan.setPosX(--x);
            if (!retourY) {
                pan.setPosY(++y) ;
            } else pan.setPosY(--y);

            pan.repaint();

            try {
                Thread.sleep(10);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    class PlayAnimation implements Runnable {
        public void run(){
            innCord();
        }
    }

    public static void main(String[] args) {
        new PanneauAnimationMain();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
}
