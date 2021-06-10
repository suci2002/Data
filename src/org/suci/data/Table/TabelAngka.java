package org.suci.data.Table;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TabelAngka {
    private JPanel rootPanel;
    private JTextField textJumlah;
    private JButton buttonUrut;
    private JTable tableAngka;
    private JTextField textMasuk;
    private JButton buttonKeluar;
    private DefaultTableModel tableModel;
    private boolean tambahkan = false;

    public JPanel getRootPanel() {
        return rootPanel;

    }
    public TabelAngka() {
        this.initComponents();

        buttonUrut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model = (DefaultTableModel) tableAngka.getModel();
                String input = textMasuk.getText();
                int jumlah = Integer.parseInt(textJumlah.getText());
                String[] xlt = input.split(",");
                if (textJumlah.getText().length() > 3) {
                    JOptionPane.showMessageDialog(rootPanel,
                            "Data Terlalu Banyak \n Maksimal Input : 999",
                            "PERHATIAN!!",
                            JOptionPane.WARNING_MESSAGE);
                    return;
                }
                if (xlt.length > jumlah || xlt.length < jumlah) {
                    JOptionPane.showMessageDialog(rootPanel,
                            "Jumlah Angka Tidak Sesuai Limit yang DiInput",
                            "PERHATIAN!!",
                            JOptionPane.WARNING_MESSAGE);
                    return;
                }
                if (!tambahkan) {
                    for (int i = 0; i < jumlah; i++) {
                        model.addRow(new Object[]{});
                    }
                    tambahkan = true;
                }
                int a = 0;
                for (int i : Urutkan.getAsce(input, jumlah)) {
                    model.setValueAt(i, a, 0);
                    a++;
                }
                int b = 0;
                for (int i : Urutkan.getDesc(input, jumlah)) {
                    model.setValueAt(i, b, 1);
                    b++;
                }
            }
        });
                buttonKeluar.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.exit(0);
                    }
            });
    }

    private void initComponents() {
        Object[] tableColom = {
                "Ascending",
                "Descending"
        };
        Object[][] iniData = {

        };
        tableModel = new DefaultTableModel(iniData, tableColom);
        tableAngka.setModel(tableModel);
        tableAngka.setAutoCreateRowSorter(true);
        tableAngka.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
}

