package com.company;

import javax.swing.*;

public class RunFile {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Data");
        jFrame.setContentPane(new PemfunATM().getATMcard());
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(500,500);
        jFrame.setVisible(true);
    }
}
