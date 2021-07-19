package org.home.brinck;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;

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
       JButton exit = new JButton("Exit");
       exit.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
       });
       GridLayout layout = new GridLayout(2,1,15,15);
       frame.setLayout(layout);
       frame.getContentPane().add(button); // Adds Button to content pane of frame
       frame.getContentPane().add(exit); // Adds Button to content pane of frame
       frame.setVisible(true);
    }
}
