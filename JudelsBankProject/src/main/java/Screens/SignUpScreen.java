package Screens;

import org.JudelsBank.BankAccount;

import javax.swing.*;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class SignUpScreen {

        private JFrame frame;
        private JPanel panel;
        private JButton button;
        private JLabel label;
        private JTextField textField;
        private JPasswordField passwordField;
        private JTextArea textArea;


        public SignUpScreen(){

            frame = new JFrame();
            frame.setTitle("Judels Bank | Sign Up");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 500);
            frame.setLocationRelativeTo(null);


            panel = new JPanel();
            panel.setLayout(null);
            frame.add(panel);

            label = new JLabel("Sign Up");
            label.setFont(new Font("Tahoma", Font.PLAIN, 20));
            label.setBounds(330, 10, 200, 30);


            panel.add(label);
            label = new JLabel("Username");
            label.setFont(new Font("Tahoma", Font.PLAIN, 20));
            label.setBounds(280, 100, 200, 20);

            panel.add(label);
            textField = new JTextField(10);
            textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
            textField.setBounds(380, 100, 200, 20);
            panel.add(textField);
            String newUsername = textField.getText();

            int newID = BankAccount.bankAccounts.size() + 1;

            label = new JLabel("Acc Number");
            label.setFont(new Font("Tahoma", Font.PLAIN, 20));
            label.setBounds(280, 130, 200, 20);
            panel.add(label);

            textField = new JTextField(10);
            textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
            textField.setBounds(380, 130, 200, 20);
            textField.setText("000000000");
            String iD = textField.getText();
            int newAccountNumber = Integer.parseInt(iD);
            panel.add(textField);

            label = new JLabel("Deposit   R");
            label.setFont(new Font("Tahoma", Font.PLAIN, 20));
            label.setBounds(280, 160, 200, 20);
            panel.add(label);
            textField = new JTextField(10);
            textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
            textField.setBounds(380, 160, 200, 20);
            textField.setText("000000000");
            panel.add(textField);
            double newBalance = Double.parseDouble(textField.getText());


            button = new JButton("Sign Up");
            button.setFont(new Font("Tahoma", Font.PLAIN, 10));
            button.setBounds(380, 190, 100, 20);
            button.setBackground(Color.CYAN);
            panel.add(button);
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    BankAccount.bankAccounts.add(new BankAccount(newID, newAccountNumber, newUsername, newBalance));
                    frame.setVisible(false);
                    MenuScreen menu = new MenuScreen();
                    menu.show();
                }
            });

        }

        public void show(){
            frame.setVisible(true);
        }

    }

