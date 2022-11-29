package com.company;

import com.company.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PemfunATM {
    private JTextField textField1;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JTextField textField2;
    private JButton browseFileButton;
    private JButton saveButton;
    private JTextArea Output;
    private JPanel ATMcard;
    private JLabel pict;
    public String imgname;

    public void insertingDataToFile(String inputtedData) throws IOException {
        try {
            FileWriter myFile = new FileWriter("FinalData.txt", true);
            myFile.write(inputtedData);
            myFile.close();
            System.out.println("Succesfully wrote to the file");
        } catch (IOException ex) {
            System.out.println("An error occured");
            ex.printStackTrace();
        }
    }

    public PemfunATM() {
        browseFileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser srchimg = new JFileChooser();

                int showOpenDialogue = srchimg.showOpenDialog(null);

                if (showOpenDialogue == JFileChooser.APPROVE_OPTION) {
                    imgname = srchimg.getSelectedFile().getName();

                    File photo = srchimg.getSelectedFile();
                    String PhotoPath = photo.getAbsolutePath();

                    ImageIcon x = new ImageIcon(PhotoPath);

                    Image image = x.getImage().getScaledInstance(pict.getWidth(), pict.getHeight(), Image.SCALE_SMOOTH);

                    pict.setIcon(new ImageIcon(image));
                }
            }
        });
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nk=textField1.getText();
                String ATM=(String)comboBox1.getSelectedItem();
                String b=(String)comboBox2.getSelectedItem();
                String np=textField2.getText();

                User AllData=new User();
                AllData.setNk(nk);
                AllData.setATM(ATM);
                AllData.setB(b);
                AllData.setNp(np);

                String op="==Tersimpan==" + "\nNo Kartu = " + nk + "\nJenis ATM = " + ATM + "\nBank = " + b +
                        "\nNama Pemilik = " + np + "\nNama Foto  = " + imgname ;

                Output.append(op);
                try {
                    insertingDataToFile(op + "\n\n");
                    imgname = null;
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
    }

    public JPanel getATMcard() {
        return ATMcard;
    }
}
