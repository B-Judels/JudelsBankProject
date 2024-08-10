package org.JudelsBank;

import Screens.MainWindow;
import Screens.MenuScreen;

import javax.swing.*;
import javax.swing.UIManager.*;


public class Launcher {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainWindow main = new MainWindow();
                main.show();

            }
        });
    }

}
