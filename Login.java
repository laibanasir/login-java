package loginapp;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class Login {
    public static void main(String args[]){
        LoginFrame frame1 = new LoginFrame();
        frame1.setTitle("Login form");
        frame1.setVisible(true);
        frame1.setBounds(10,10,370,600);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setResizable(false);
}
}
