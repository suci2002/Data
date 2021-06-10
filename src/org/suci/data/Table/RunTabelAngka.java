package org.suci.data.Table;

import javax.swing.*;

public class RunTabelAngka {
    public static void main(String[] args) {

        ImageIcon ImageIcon = new ImageIcon("res/Leisure.jpg");
        JFrame gambar = new JFrame("Aplikasi Pengurutan Data");
        gambar.setIconImage(ImageIcon.getImage());
        gambar.setContentPane(new TabelAngka().getRootPanel() );
        gambar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gambar.setSize(700,450);
        gambar.setLocationRelativeTo(null);
        gambar.setVisible(true);
    }
}
