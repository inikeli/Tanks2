package main;

import display.Display;

import javax.swing.*;
import java.awt.event.ActionEvent;
import javax.swing.Timer;

public class Main {
    public static void main(String[] args) {

        Display.create(800, 600,"TANKS", 0xff556b2f);

        Timer t = new Timer(1000/60, new AbstractAction(){

            public void actionPerformed(ActionEvent e){

            Display.clear();
            Display.render();
            Display.swapBuffers();

            }
        });

        t.setRepeats(true);
        t.start();

    }
}
