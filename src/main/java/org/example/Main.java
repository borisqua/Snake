package org.example;

import org.example.gui.GameField;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Starting Snake app...");

        SwingUtilities.invokeLater(GameField::new);
    }
}