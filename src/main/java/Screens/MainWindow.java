package Screens;

import org.JudelsBank.BankAccount;
import org.JudelsBank.Launcher;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;



public class MainWindow {

    private JFrame frame;
    private JPanel panel;
    private JButton button;
    private JLabel label;
    private JTextField textField;
    private JPasswordField passwordField;
    private JButton button2;



    public MainWindow(){

        BankAccount.bankAccounts.add(new BankAccount(1,123456789, "Bernard", 500));

        frame = new JFrame();
        frame.setTitle("Judels Bank | Sign In");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 500);
        frame.setLocationRelativeTo(null);
        frame.setBackground(Color.CYAN);


        panel = new JPanel();
        panel.setLayout(null);
        frame.add(panel);

        label = new JLabel("Judels Bank");
        label.setFont(new Font("Tahoma", Font.PLAIN, 20));
        label.setBounds(330, 10, 200, 20);


        panel.add(label);
        label = new JLabel("Username");
        label.setFont(new Font("Tahoma", Font.PLAIN, 20));
        label.setBounds(280, 100, 200, 20);

        panel.add(label);
        textField = new JTextField(10);
        textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
        textField.setBounds(380, 100, 200, 20);
        panel.add(textField);
        String newName = textField.getText();

        label = new JLabel("Acc Number");
        label.setFont(new Font("Tahoma", Font.PLAIN, 20));
        label.setBounds(280, 130, 200, 20);
        panel.add(label);

//        passwordField = new JPasswordField(10);
//        passwordField.setFont(new Font("Tahoma", Font.PLAIN, 20));
//        passwordField.setBounds(380, 130, 200, 20);
//        passwordField.setEchoChar('*');
//        passwordField.setText("0");
//        panel.add(passwordField);
//        String password = passwordField.getText();
//        int newPassword = Integer.parseInt(password);

        textField = new JTextField(10);
        textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
        textField.setBounds(380, 130, 200, 20);
        textField.setText("0");
        String password = textField.getText();
        int newPassword = Integer.parseInt(password);
        panel.add(textField);


        button = new JButton("Sign In");
        button.setFont(new Font("Tahoma", Font.PLAIN, 10));
        button.setBounds(380, 160, 100, 20);
        button.setBackground(Color.CYAN);
        panel.add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){

                    if (BankAccount.bankAccounts.get(0).getName().equals(newName) && BankAccount.bankAccounts.get(0).getAccountNumber() == newPassword ) {
                        System.out.println("Logged in");
                        frame.setVisible(false);
                        MenuScreen menu = new MenuScreen();
                        menu.show();

                    }else {
                        System.out.println("incorrect details" + newPassword);
                    }
                }
        });

        button2 = new JButton("Sign Up");
        button2.setFont(new Font("Tahoma", Font.PLAIN, 10));
        button2.setBounds(380, 185, 100, 20);
        button2.setBackground(Color.CYAN);
        panel.add(button2);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                SignUpScreen signUp = new SignUpScreen();
                signUp.show();

            }

        });

    }

    public void show(){
        frame.setVisible(true);
    }

}
