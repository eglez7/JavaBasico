package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class fromPrueba {

    public fromPrueba() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("MainForm");
        frame.setContentPane(new fromPrueba().MainForm);
        frame.setVisible(true);
    }

    private JPanel MainForm;
    private JButton button1;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;


}
