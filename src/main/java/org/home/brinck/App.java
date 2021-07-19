package org.home.brinck;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
class App{
    public static void main(String args[]){
       JFrame frame = new JFrame("My First GUI");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(300,300);
       JButton button = new JButton("Press");
       button.addActionListener(new ActionListener () {
        public void actionPerformed(ActionEvent e) {
            System.out.println("Button Pressed");
        }
       });
       frame.getContentPane().add(button); // Adds Button to content pane of frame
       frame.setVisible(true);
    }
}
