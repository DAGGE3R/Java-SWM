package ds_java;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DsPannel extends JPanel implements ActionListener {

    DsAnimation pan = new DsAnimation();
    private Thread t ;
    JButton button = new JButton( "");
    boolean retourX = false ;
    boolean retourY = false ;
    private boolean animated = false ;

    public void setAnimated(boolean animated) {
        this.animated = animated;
    }

    DsPannel(String color) {
        button.setText("start " + color);
        pan.setBallColor(color);
        this.setLayout(new BorderLayout());
        this.add(pan, BorderLayout.CENTER);
        this.add(button, BorderLayout.SOUTH);

        button.addActionListener(e -> {
            this.animated= true ;
            t= new Thread(new PlayAnimation()) ;
            t.start();
        });

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




    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
