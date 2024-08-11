package Screens;

import org.JudelsBank.BankAccount;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MenuScreen {
    private JFrame frame;
    private JPanel panel;
    private JButton button;
    private JLabel label;
    private JTextField textField;
    private JPasswordField passwordField;
    private JFrame frameB;


    public MenuScreen(){
        frame = new JFrame();
        frame = new JFrame();
        frame.setTitle("Judels Bank | Menu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 500);
        frame.setLocationRelativeTo(null);

        panel = new JPanel();
        panel.setLayout(null);
        frame.add(panel);
        label = new JLabel("Menu");
        label.setFont(new Font("Tahoma", Font.PLAIN, 20));
        label.setBounds(350, 10, 200, 20);
        panel.add(label);

        button = new JButton("Balance");
        button.setFont(new Font("Tahoma", Font.PLAIN, 12));
        button.setBounds(330, 100, 100, 20);
        button.setBackground(Color.CYAN);
        panel.add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame = new JFrame();
                frame.setTitle("Judels Bank | Balance");
                frame.setSize(400, 250);
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);

                panel = new JPanel();
                panel.setLayout(new BorderLayout());
                frame.add(panel);
                label = new JLabel("Your Balance is: R" + BankAccount.bankAccounts.get(0).getBalance());
                label.setFont(new Font("Tahoma", Font.PLAIN, 12));
                label.setVerticalAlignment(SwingConstants.CENTER);
                label.setHorizontalAlignment(SwingConstants.CENTER);
                panel.add(label);

            }
        });

        button = new JButton("Deposit");
        button.setFont(new Font("Tahoma", Font.PLAIN, 12));
        button.setBounds(330, 120, 100, 20);
        button.setBackground(Color.CYAN);
        panel.add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frameB = new JFrame();
                frameB.setTitle("Judels Bank | Deposit");
                frameB.setSize(400, 250);
                frameB.setLocationRelativeTo(null);
                frameB.setVisible(true);

                panel = new JPanel();
                panel.setLayout(new FlowLayout());
                frameB.add(panel);
                label = new JLabel("How much do you want to deposit?: R");
                label.setFont(new Font("Tahoma", Font.PLAIN, 12));
                label.setVerticalAlignment(SwingConstants.CENTER);
                label.setHorizontalAlignment(SwingConstants.CENTER);
                panel.add(label);

                textField = new JTextField(10);
                textField.setFont(new Font("Tahoma", Font.PLAIN, 12));
                textField.setHorizontalAlignment(SwingConstants.CENTER);
                textField.setText("0000");
                panel.add(textField);

                button = new JButton("Done");
                button.setFont(new Font("Tahoma", Font.PLAIN, 12));
                button.setBackground(Color.CYAN);
                button.setVerticalAlignment(SwingConstants.CENTER);
                button.setHorizontalAlignment(SwingConstants.CENTER);
                panel.add(button);
                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        double newDeposit = Double.parseDouble(textField.getText());
                        double newestBalance = BankAccount.bankAccounts.get(0).getBalance() + newDeposit;
                        BankAccount.bankAccounts.get(0).setBalance(newestBalance);
                        frameB.setVisible(false);
                    }
                });

            }
        });


        button = new JButton("Withdraw");
        button.setFont(new Font("Tahoma", Font.PLAIN, 12));
        button.setBounds(330, 140, 100, 20);
        button.setBackground(Color.CYAN);
        panel.add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frameB = new JFrame();
                frameB.setTitle("Judels Bank | Deposit");
                frameB.setSize(400, 250);
                frameB.setLocationRelativeTo(null);
                frameB.setVisible(true);

                panel = new JPanel();
                panel.setLayout(new FlowLayout());
                frameB.add(panel);
                label = new JLabel("How much do you want to deposit?: R");
                label.setFont(new Font("Tahoma", Font.PLAIN, 12));
                label.setVerticalAlignment(SwingConstants.CENTER);
                label.setHorizontalAlignment(SwingConstants.CENTER);
                panel.add(label);

                textField = new JTextField(10);
                textField.setFont(new Font("Tahoma", Font.PLAIN, 12));
                textField.setHorizontalAlignment(SwingConstants.CENTER);
                textField.setText("0000");
                panel.add(textField);

                button = new JButton("Done");
                button.setFont(new Font("Tahoma", Font.PLAIN, 12));
                button.setBackground(Color.CYAN);
                button.setVerticalAlignment(SwingConstants.CENTER);
                button.setHorizontalAlignment(SwingConstants.CENTER);
                panel.add(button);
                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        double newDeposit = Double.parseDouble(textField.getText());
                        double newestBalance = BankAccount.bankAccounts.get(0).getBalance() + newDeposit;
                        BankAccount.bankAccounts.get(0).setBalance(newestBalance);
                        frameB.setVisible(false);
                    }
                });

            }
        });
        frameB = new JFrame();
        frameB.setTitle("Judels Bank | Deposit");
        frameB.setSize(400, 250);
        frameB.setLocationRelativeTo(null);
        frameB.setVisible(true);

        panel = new JPanel();
        panel.setLayout(new FlowLayout());
        frameB.add(panel);
        label = new JLabel("How much do you want to withdraw?: R");
        label.setFont(new Font("Tahoma", Font.PLAIN, 12));
        label.setVerticalAlignment(SwingConstants.CENTER);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(label);

        textField = new JTextField(10);
        textField.setFont(new Font("Tahoma", Font.PLAIN, 12));
        textField.setHorizontalAlignment(SwingConstants.CENTER);
        textField.setText("0000");
        panel.add(textField);

        button = new JButton("Done");
        button.setFont(new Font("Tahoma", Font.PLAIN, 12));
        button.setBackground(Color.CYAN);
        button.setVerticalAlignment(SwingConstants.CENTER);
        button.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double newDeposit = Double.parseDouble(textField.getText());
                double newestBalance = BankAccount.bankAccounts.get(0).getBalance() - newDeposit;
                BankAccount.bankAccounts.get(0).setBalance(newestBalance);
                frameB.setVisible(false);
            }
        });

    }


    public void show(){
        frame.setVisible(true);
    }
}
